package homeWork6;

import homeWork6.CustomException.CreateFileException;
import homeWork6.api.ISearchEngine;
import homeWork6.search.ClassEasySearch;
import homeWork6.search.EasySearch;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;

import static homeWork6.BooksSearch.readFile;
public class SearchWithMultithreadingLambda {

    private static final int COUNT_THREAD = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите путь к папке с текстовыми файлами: ");
        String folderPath = scanner.nextLine();
        File folder = new File(folderPath);
        if (!folder.isDirectory()) {
            System.out.println("Указанный путь не является директорией.");
            return;
        }
        String resultFileName = folderPath + "/" + "result.txt";
        String searchWord;
        do {
            System.out.print("Введите слово для поиска (0 для выбора другого файла): ");
            searchWord = scanner.nextLine();
            if (!searchWord.equalsIgnoreCase("0") & !searchWord.isBlank() & !searchWord.isEmpty()) {
                multithreadingSearch(folder, searchWord, resultFileName);
            }
        } while (!searchWord.equalsIgnoreCase("0") & !searchWord.isBlank() & !searchWord.isEmpty());

        System.out.println("Результаты поиска сохранены в файле " + "result.txt");
    }

    private static void multithreadingSearch(File folder, String searchWord, String resultFileName) {
        ExecutorService executor = Executors.newFixedThreadPool(COUNT_THREAD);
        List<Future<String>> listFuture = new ArrayList<Future<String>>();
        List<String> resultToWrite = new ArrayList<>();
        for (File file : folder.listFiles()) {
            if (file.isFile() & file.getName().toLowerCase().endsWith(".txt")) {
                System.out.println("Поиск в файле" + file.getName() + "слова " + searchWord);
                //нужно через лямбду, но пока так
                //  Callable<String> callableTask = new MyCallable(file, searchWord);
                //лямбда
                Callable<String> callableTask = () -> {
                    StringBuilder resultBuilder = new StringBuilder();
                    String content;
                    try {
                        Charset сharset = Charset.forName("Cp866");
                        content = readFile(file.getPath(), сharset);
                        ISearchEngine searchEngine = new ClassEasySearch();
                        long count = searchEngine.search(content, searchWord);
                        resultBuilder.append(file.getName()).append(" - ").append(searchWord).append(" - ").append(count);
                    } catch (IOException e) {
                        resultBuilder.append(file.getName()).append(" - ").append("Ошибка при чтении файла"); //append("\n")
                        return resultBuilder.toString();
                    }
                    return resultBuilder.toString();
                };
                //добавляем в пул потоков
                Future<String> future = executor.submit(callableTask);
                //добавить Future в список, чтобы потом получить значения
                listFuture.add(future);
            }
        }

        //После завершения сохраняем результаты в файл
        listFuture.forEach(futureResult -> {
            String result = null;
            try {
                result = futureResult.get();
                resultToWrite.add(result);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        });

        executor.shutdown();

        try {
            // Сохраняем результаты в файл
            saveResult(resultToWrite, resultFileName);
        } catch (CreateFileException ex) {
            System.out.println("Ошибка при записи результата");
        }

        try {
            String content = readFile(resultFileName,  Charset.forName("UTF-8"));
            System.out.println(content);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении результирующего файла");
        }
    }

    private static void saveResult(List<String> resultList, String fileName) throws CreateFileException {
        File file = new File(fileName);
        //  String listString = String.join(", ", resultList);
        String listString = resultList.stream()
                .collect(Collectors.joining(",\n"));
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), StandardCharsets.UTF_8))) {
            writer.write(listString);
        } catch (IOException e) {
            throw new CreateFileException("Ошибка при записи результата в файл: " + fileName + " " + e.getMessage());
        }
    }

    private static class MyCallable implements Callable<String> {
        private final File file;
        private final String searchWord;

        public MyCallable(File file, String searchWord) {
            this.file = file;
            this.searchWord = searchWord;
        }

        @Override
        public String call() throws Exception {
            StringBuilder resultBuilder = new StringBuilder();
            String content;
            try {
                Charset сharset = Charset.forName("Cp866");
                content = readFile(file.getPath(), сharset);
                ISearchEngine searchEngine = new ClassEasySearch();
                long count = searchEngine.search(content, searchWord);
                resultBuilder.append(file.getName()).append(" - ").append(searchWord).append(" - ").append(count);
            } catch (IOException e) {
                resultBuilder.append(file.getName()).append(" - ").append("Ошибка при чтении файла"); //append("\n")
                return resultBuilder.toString();
            }
            return resultBuilder.toString();
        }

        private static void saveResult(String fileName, File searchFile, String word, long count) throws CreateFileException {
            File file = new File(fileName);
            try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), StandardCharsets.UTF_8))) {
                String result = String.format("%s - %s - %d%n", searchFile.getName(), word, count);
                writer.write(result);
            } catch (IOException e) {
                throw new CreateFileException("Ошибка при записи результата в файл: " + fileName + " " + e.getMessage());
            }
        }

        public static String readFile(String path, Charset encoding) throws IOException {
            StringBuilder contentBuilder = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path), encoding))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    contentBuilder.append(line).append("\n");
                }
            }
            return contentBuilder.toString();
        }
    }
}


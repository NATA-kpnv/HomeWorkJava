package homeWork6;

import homeWork6.api.ISearchEngine;
import homeWork6.search.EasySearch;
import homeWork6.CustomException.*;
import homeWork6.search.RegExSearch;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.nio.charset.StandardCharsets;
public class BooksSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите путь к папке с текстовыми файлами: ");
        String folderPath = scanner.nextLine();

        File folder = new File(folderPath);
        if (!folder.isDirectory()) {
            System.out.println("Указанный путь не является директорией.");
            return;
        }

        File[] files = folder.listFiles();
        List<File> txtFiles = new ArrayList<>();
        for (int i = 0; i < files.length; i++) {
            File file = files[i];
            if (file.isFile() && file.getName().toLowerCase().endsWith(".txt")) {
                txtFiles.add(file);
            }
        }

        if (txtFiles == null || txtFiles.size() == 0) {
            System.out.println("В указанной папке нет текстовых файлов.");
            return;
        }

        String resultFileName = folderPath + "/" + "result.txt";

        int choice = -1;
        File selectedFile = null;
        while (true) {
            if (choice == 0) {
                break;
            }

            if (selectedFile == null) {
                System.out.println("Выберите файл для поиска:");
                for (int i = 0; i < txtFiles.size(); i++) {
                    System.out.println((i + 1) +". " + txtFiles.get(i).getName());
                }

                System.out.print("Введите номер файла (0 для выхода): ");
                choice = scanner.nextInt();

                if (choice < 0 || choice > txtFiles.size()) {
                    System.out.println("Некорректный номер файла.");
                    continue;
                } else if (choice == 0) {
                    break;
                }

                selectedFile = txtFiles.get(choice - 1);
            }

            try {
                // Charset сharset = Charset.forName("CP1251");
               // Charset сharset = Charset.forName("Windows-1251");
                Charset сharset = Charset.forName("Cp866");
                scanner.nextLine();

                 String content =  readFile(selectedFile.getPath(),  сharset );

                System.out.print("Введите слово для поиска (0 для выбора другого файла): ");
                String searchWord = scanner.nextLine();

                if (searchWord.equals("0")) {
                    selectedFile = null; // Сбрасываем выбранный файл, чтобы выбрать другой
                    continue;
                }

                ISearchEngine searchEngine = new EasySearch();
                System.out.println("Найдено обычным поиском с учетом регистра:");
                long count = searchEngine.search(content, searchWord);
                System.out.println("Результат поиска: " + count + " раз(а)");

//                ISearchEngine regExSearch = new RegExSearch();
//                System.out.println("Найдено поиском c регулярным выражение (только целые слова):");
//                count = searchEngine.search(content, searchWord);
//                System.out.println("Результат поиска: " + count + " раз(а)");

                saveResult(resultFileName, selectedFile, searchWord, count);
                count = 0;

            } catch (IOException e) {
                System.out.println("Ошибка при чтении файла");
                selectedFile = null;
                break;
            } catch (CreateFileException ex) {
                System.out.println("Ошибка при записи результата");
                selectedFile = null;
                break;
            }
        }
        scanner.close();
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

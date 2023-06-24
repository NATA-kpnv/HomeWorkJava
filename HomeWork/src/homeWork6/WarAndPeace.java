package homeWork6;

import homeWork6.api.ISearchEngine;
import homeWork6.search.*;


import java.util.*;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WarAndPeace {
    public static void main(String[] args) {
         String content = null;
         String path = "HomeWork/src/homeWork6/books/Война и мир_книга.txt";
         //String path = "HomeWork/src/homeWork6/books/test.txt";

        //Read File
        try {
            content = readFile(path, StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла") ;
            e.printStackTrace() ;
        }
        if (content != null) {

            //Get count
            int countWords = getCountWords(content);
            System.out.println("Количество слов в тексте: " + countWords);

            //Get topN words
            Map<String, Integer> wordCountMapTop = new HashMap<>();
            wordCountMapTop = getTopWords(content, 5);
            for (Map.Entry<String, Integer> entry : wordCountMapTop.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " раз");
            }

            String peace = "мир";
            String war = "война";
            String and = " и ";

            ISearchEngine searchEngine = new EasySearch();
            System.out.println("Найдено обычным поиском с учетом решистра:");
            printCountSearch(searchEngine, content, war);
            printCountSearch(searchEngine, content, peace);
            printCountSearch(searchEngine, content, and);

            ISearchEngine caseInsensetiveSearch = new CaseInsensetiveSearch(searchEngine);
            System.out.println("Найдено поиском без учета регистра:");
            printCountSearch(caseInsensetiveSearch,content,war);
            printCountSearch(caseInsensetiveSearch,content,peace);
            printCountSearch(caseInsensetiveSearch,content,and);

            ISearchEngine regExSearch = new RegExSearch();
            System.out.println("Найдено поиском c регулярным выражение (только целые слова):");
            printCountSearch(regExSearch,content,war);
            printCountSearch(regExSearch,content,peace);
            printCountSearch(regExSearch,content,and);


            ISearchEngine searcEngineRoot = new SearchEngineRoot(regExSearch);
            System.out.println("Найдено поиском без учета падежа (только целые слова):");
            printCountSearch(searcEngineRoot,content,war);
            printCountSearch(searcEngineRoot,content,peace);
            printCountSearch(searcEngineRoot,content,and);

//            ISearchEngine caseNormalizerReg = new SearchEngineCaseNormalizer(regExSearch );

        }
    }
    //Task 1 Прочитать файл
    public static String readFile(String path, Charset encoding) throws IOException {
        return Files.readString(Paths.get(path), encoding);
    }

    /**
     * Разделение строки на отдельные слова
     * @param str строка
     * @return массив слов
     */
    public static String[] splitString(String str) {
        Set<String> set = new HashSet<>();
        String regular = "(?U)[^\\w-]+";
        String[] wordArray = str.trim().split(regular);
        return wordArray;
    }

    /**
     * Task 2.1 Найти в тексте все использованные слова
     * @param str строка
     * @return количество уникальных слов
     */
    public static int getCountWords(String str) {
        Set<String> set = new HashSet<>();
        String[] wordArray = WarAndPeace.splitString(str);
        for (String word : wordArray) {
            set.add(word);
        }
        return set.size();
    }

    /**
     *
     * @param str
     * @param top
     * @return Map<String, Integer> </Word,CountWord>
     */
    public  static Map<String, Integer>  getTopWords(String  str, int top){
        Map<String, Integer> wordCountMap = new HashMap<>();
        Map<String, Integer> wordCountMapTop = new HashMap<>();
        String[] wordArray = WarAndPeace.splitString(str);
        for (String word : wordArray) {
            //wordCountMap.
            //wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
         wordCountMap.merge(word, 1, (prev, one) -> prev + one);
        }
        List<Map.Entry<String,Integer>>  wordList = new ArrayList<>();
        wordList.addAll(wordCountMap.entrySet());
        wordCountMap.clear();
        // определяем пользовательский порядок сортировки списка с помощью лямбда-выражения
        Collections.sort(wordList, ((o1, o2) -> o2.getValue().compareTo(o1.getValue())));
        for (int i = 0; i < top && i < wordList.size(); i++) {
            Map.Entry<String, Integer> entry = wordList.get(i);
            wordCountMapTop.put(entry.getKey(),entry.getValue() );
        }
        return wordCountMapTop;
    }

    public static void printCountSearch(ISearchEngine search, String text, String word) {
        long count  = search.search(text, word);
        System.out.println("Слово " + "\"" + word+  "\"" + " в тексте встречается " + count +" раз.");
    }
}


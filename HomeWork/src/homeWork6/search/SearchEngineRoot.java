package homeWork6.search;

import homeWork6.api.ISearchEngine;

public class SearchEngineRoot implements ISearchEngine {
    private final ISearchEngine searchEngine;

    public SearchEngineRoot(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    @Override
    public long search(String text, String word) {
        String lowerCaseText = text.toLowerCase();
        String lowerCaseWord = word.toLowerCase();
        String regex = "(?U)(?i)(а|я|и|е|у|ю|ом|ем|ой|ей|ы|ов|ев|о)(\\s+|\\W+|$)"; //|[^\w] ^\w
        String rootWord = lowerCaseWord.replaceAll(regex,"");
        String rootText = lowerCaseText.replaceAll(regex," ");
        System.out.println(rootWord);
        return searchEngine.search(rootText, rootWord);
    }

}

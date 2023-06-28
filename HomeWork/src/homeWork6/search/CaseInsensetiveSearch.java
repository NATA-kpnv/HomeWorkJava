package homeWork6.search;

import homeWork6.api.ISearchEngine;

public class CaseInsensetiveSearch implements ISearchEngine {
    private final ISearchEngine searchEngine;

    public CaseInsensetiveSearch(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    @Override
    public long search(String text, String word) {
        String lowerCaseText = text.toLowerCase();
        String lowerCaseWord = word.toLowerCase();
        return searchEngine.search(lowerCaseText, lowerCaseWord);
    }



}

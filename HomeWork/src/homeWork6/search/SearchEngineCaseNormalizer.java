package homeWork6.search;

import homeWork6.api.ISearchEngine;

public class SearchEngineCaseNormalizer implements ISearchEngine {
    private final ISearchEngine searchEngine;

    public SearchEngineCaseNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    @Override
    public long search(String text, String word) {
        String normalizedText = normalizeText(text);
        String normalizedWord = normalizeWord(word);
        return searchEngine.search(normalizedText , normalizedWord);
    }

    private String normalizeText(String text) {
        String lowerCaseText = text.toLowerCase();
        return text;
    }

    private String normalizeWord(String word) {
        String lowerCaseWord = word.toLowerCase();
        return word;
    }
}

package homeWork6.test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import homeWork6.search.*;
import homeWork6.api.ISearchEngine;
public class TestSearch {
    @Test
    public void testEasySearch() {
        ISearchEngine searchEngine = new EasySearch();
        String text = "Мама мыла раму мылом";
        String word = "мыл";
        long count = searchEngine.search(text, word);
        Assertions.assertEquals(2, count);
    }
    @Test
    public void testEasySearchCase() {
        ISearchEngine searchEngine = new EasySearch();
        String text = "Мама мыла раму мылом";
        String word = "Мыл";
        long count = searchEngine.search(text, word);
        Assertions.assertEquals(0, count);
    }

    @Test
    public void testCaseInsensitiveSearch() {
        ISearchEngine searchEngine = new EasySearch();
        ISearchEngine caseInsensitiveSearch = new CaseInsensetiveSearch(searchEngine);
        String text = "Мама мыла раму мылом";
        String word = "Мыл";
        long count = caseInsensitiveSearch.search(text, word);
        Assertions.assertEquals(2, count);
    }

    @Test
    public void testRegExSearchRoot() {
        ISearchEngine searchEngine = new RegExSearch();
        String text = "Мама мыла раму мылом";
        String word = "мыл";
        long count = searchEngine.search(text, word);
        Assertions.assertEquals(0, count);
    }

    @Test
    public void testRegExSearchAllWord() {
        ISearchEngine searchEngine = new RegExSearch();
        String text = "Мама мыла раму мылом";
        String word = "мыла";
        long count = searchEngine.search(text, word);
        Assertions.assertEquals(1, count);
    }

    @Test
    public void testSearchEngineRoot() {
        ISearchEngine searchEngine = new RegExSearch();
        ISearchEngine searchEngineRoot = new SearchEngineRoot(searchEngine);
        String text = "Мама мыла раму мылом";
        String word = "мыло";
        long count = searchEngineRoot.search(text, word);
        Assertions.assertEquals(1, count);
    }

    @Test
    public void testSearchClass() {
        ISearchEngine searchEngine = new ClassEasySearch();
        String text = "Мама мыла мыламылом мыла,раму мылом";
        String word = "мыла";
        long count = searchEngine.search(text, word);
        Assertions.assertEquals(2, count);
    }
}

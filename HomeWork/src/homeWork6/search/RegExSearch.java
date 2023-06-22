package homeWork6.search;

import homeWork6.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    @Override
    public long search(String text, String word) {
        String lowerCaseText = text.toLowerCase();
        String lowerCaseWord = word.toLowerCase();
        String regex = String.format("(?U).*?\\b%s\\b.*?", lowerCaseWord ); //берет целое слово
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lowerCaseText);
        int from = 0;
        long  count = 0;
        while(matcher.find(from)) {
            count++;
            from = matcher.end();
        }
        return count;
    }
}

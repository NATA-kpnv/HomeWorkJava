package homeWork6.search;
import homeWork6.api.ISearchEngine;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class ClassEasySearch implements ISearchEngine {


    //    private final char[] splitSymbols = {' ',',','!','.',')','(','\''};
    private final static char[] SPLIT_SYMBOLS = ",!.)('".toCharArray();
    private final static Set<Character> SPLIT_SYMBOLS_SET = new HashSet<>(Arrays.asList(' ',',','!','.',')','(','\'','-'));


    @Override
    public long search(String text, String word) {
        int textLength = text.length();
        int wordLength = word.length();
        long count = 0;

        int nextStartPosition = 0;
        while((nextStartPosition = text.indexOf(word, nextStartPosition)) != -1 ){
            if (checkFoundWord(text, textLength, nextStartPosition, wordLength)) {
                count++;
            }
            nextStartPosition += wordLength;
        }

        return count;
    }

    private boolean checkFoundWord(String text, int foundPosition, int wordLength){
        return checkFoundWord(text, text.length(), foundPosition, wordLength);
    }

    private boolean checkFoundWord(String text, int textLength, int foundPosition, int wordLength){
        if(textLength == wordLength){
            return true;
        }

        boolean needCheckBefore = foundPosition != 0;

        if(needCheckBefore){
            char charBeforeFoundWord = text.charAt(foundPosition - 1);
            if(!isSplitChar3(charBeforeFoundWord)){
                return false;
            }
            //TODO убрать это говно
            if(charBeforeFoundWord == '-' && foundPosition - 2 > -1 && !isSplitChar3(text.charAt(foundPosition - 2))){
                return false;
            }
        }

        boolean needCheckAfter = textLength != foundPosition + wordLength;

        if(needCheckAfter){
            char charAfterFoundWord = text.charAt(foundPosition + wordLength);
            if(!isSplitChar3(charAfterFoundWord)){
                return false;
            }
            //TODO дождись когда скажут что ты был прав
            if(charAfterFoundWord == '-' && foundPosition + 2 < textLength && !isSplitChar3(text.charAt(foundPosition + 2))){
                return false;
            }
        }

        return true;
    }

    private boolean isSplitChar(char foundChar){
        return foundChar == ' '
                || foundChar == ','
                || foundChar == '!'
                || foundChar == '.'
                || foundChar == ')'
                || foundChar == '('
                ;
    }

    private boolean isSplitChar2(char foundChar){
        for (char splitSymbol : SPLIT_SYMBOLS) {
            if(splitSymbol == foundChar){
                return true;
            }
        }
        return false;
    }

    private boolean isSplitChar3(char foundChar){
        return SPLIT_SYMBOLS_SET.contains(foundChar);
    }
}

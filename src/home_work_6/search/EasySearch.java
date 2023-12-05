package home_work_6.search;

import home_work_6.api.ISearchEngine;

public class EasySearch implements ISearchEngine {
    @Override
    public long search(String text, String word) {
        int count = 0;
        int index = 0;
        int pos;
        while ((pos = text.indexOf(word, index)) != -1) {
            if ((pos == 0 || checkSymbol(text, pos - 1)) && ((pos + word.length() >= text.length()) || checkSymbol(text, pos + word.length()))) {
                boolean isValid = true;

                if (pos != 0 && '-' == text.charAt(pos - 1)) {
                    int hyphenPos = pos - 1;
                    if (!(hyphenPos == 0 || checkSymbol(text, hyphenPos - 1) || '-' == text.charAt(hyphenPos - 1))) {
                        isValid = false;
                    }
                }
                if (pos + word.length() < text.length() && '-' == text.charAt(pos + word.length())) {
                    int hyphenPos = pos + word.length();
                    if (!((hyphenPos + 1 >= text.length()) || checkSymbol(text, hyphenPos + 1) || '-' == text.charAt(hyphenPos + 1))) {
                        isValid = false;
                    }
                }

                if (isValid) {
                    count++;
                }
            }
            index = pos + word.length();
        }
        return count;
    }

    /**
     * Метод проверки позиции в тексте на наличие спец.символа
     *
     * @param text - используемый текст
     * @param pos  - позиция в тексте
     * @return - <code>true</code>, если на указанной позиции находится спец.символ, и <code>false</code> в противном случае
     */
    private boolean checkSymbol(String text, int pos) {
        String symbols = " ,.?!:;@()/|\"\n\\'<>-";
        return symbols.indexOf(text.charAt(pos)) > -1;
    }
}

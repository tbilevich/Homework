package home_work_6.search;

import home_work_6.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegExSearch implements ISearchEngine {
    @Override
    public long search(String text, String word) {
        long count = 0;
        Pattern pattern = Pattern.compile("(?<=^|[^а-яА-ЯёЁ\\w-]|(?<=^|[^а-яА-ЯёЁ\\w])-)" + word + "(?=-([^а-яА-ЯёЁ\\w]|$)|[^а-яА-ЯёЁ\\w-]|$)");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}

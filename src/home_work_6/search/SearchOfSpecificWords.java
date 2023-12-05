package home_work_6.search;

import home_work_6.utils.TextUtils;

import java.nio.file.Path;

public class SearchOfSpecificWords {

    private EasySearch easySearch = new EasySearch();
    private RegExSearch regExSearch = new RegExSearch();
    public String specificWords() {
        String text = TextUtils.convertFileToStr(Path.of("Война и мир_книга.txt"));
        long numWar = regExSearch.search(text, "война");
        long numAnd = regExSearch.search(text, "и");
        long numWorld = regExSearch.search(text, "мир");
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("война = ");
        stringBuilder.append(numWar);
        stringBuilder.append(", и = ");
        stringBuilder.append(numAnd);
        stringBuilder.append(", мир = ");
        stringBuilder.append(numWorld);
        return stringBuilder.toString();
    }
}

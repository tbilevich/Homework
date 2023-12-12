package home_work_6.task;

import home_work_6.search.EasySearch;
import home_work_6.utils.TextUtils;

import java.io.File;
import java.nio.file.Path;
import java.util.concurrent.Callable;

public class SearchWord implements Callable<String> {
    private final String book;
    private final String word;
    private final EasySearch easySearch = new EasySearch();

    public SearchWord(String book, String word) {
        this.book = book;
        this.word = word;
    }

    @Override
    public String call() {
        String bookText = TextUtils.convertFileToStr(Path.of("library" + File.separator + book));
        long count = easySearch.search(bookText, word);
        return "Book: " + book + "; the searched word: " + word + " = " + count;
    }
}

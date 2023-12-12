package home_work_6.task;

import home_work_6.utils.TextUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchWordTest {
    @Test
    public void testCall() throws InterruptedException, ExecutionException {
        ExecutorService es = Executors.newSingleThreadExecutor();
        Future<String> future = es.submit(new SearchWord("Война и мир_книга.txt", "и"));
        assertEquals("Book: Война и мир_книга.txt; the searched word: и = 13874", future.get());
    }
}

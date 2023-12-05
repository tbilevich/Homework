package home_work_6.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FileUtilsTest {
    @Test
    @DisplayName("Проверка наличия файлов в папке")
    public void folderWithBooksTest() {
        List<String> list = FileUtils.folderWithBooks(Path.of("library"));
        assertNotNull(list);
        assertEquals(list.size(), 104);
        assertTrue(list.contains("10.txt"));
        assertTrue(list.contains("maugli.txt"));
        assertTrue(list.contains("алые паруса.txt"));
    }

    @Test
    @DisplayName("Проверка несуществующей папки")
    public void notExistFolderTest() {
        List<String> list = FileUtils.folderWithBooks(Path.of("empty"));
        assertNotNull(list);
        assertEquals(list.size(), 0);
    }

    @Test
    @DisplayName("Проверка очистки файла")
    public void clearFileTest() throws IOException {
        String testFilePath = "testest.txt";
        Files.write(Path.of(testFilePath), "привет".getBytes(), StandardOpenOption.CREATE);
        String contentBeforeClear = Files.readString(Path.of(testFilePath));
        assertEquals("привет", contentBeforeClear);
        FileUtils.clearFile(Path.of(testFilePath));
        String contentAfterClear = Files.readString(Path.of(testFilePath));
        assertEquals("", contentAfterClear);
   }

    @Test
    @DisplayName("Проверка очистки несуществующего файла")
    public void nonExistentFileTest() {
        Path filePath = Paths.get("file/path");
        assertThrows(RuntimeException.class, () -> FileUtils.clearFile(filePath));
    }

    @Test
    @DisplayName("Проверка записи в файл")
    public void writeFileTest() throws IOException {
        String bookName = "testtesttest.txt";
        String word = "testtesttest";
        long count = 7;
        FileUtils.clearFile(Path.of("result.txt"));
        FileUtils.writeFile(bookName, word, count);
        String actual = Files.readString(Path.of("result.txt"));
        String expected = "Book: testtesttest.txt; the searched word: testtesttest = 7" + System.lineSeparator();
        assertEquals(expected, actual);
    }

}

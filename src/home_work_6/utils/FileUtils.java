package home_work_6.utils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    /**
     * Метод чтения файлов из папки
     *
     * @param pathname - путь к папке с книгами
     * @return - возвращает список книг
     */
    public static List<String> folderWithBooks(Path pathname) {
        File folder = new File(pathname.toUri());

        if (folder.exists()) {
            File[] books = folder.listFiles();
            List<String> listOfBooks = new ArrayList<>();
            for (File book : books) {
                listOfBooks.add(book.getName());
            }
            return listOfBooks;
        }
        return new ArrayList<>();
    }

    /**
     * Метод очистки файла перед новым использованием поиска слов в книгах
     *
     * @param pathname - путь к файлу
     */
    public static void clearFile(Path pathname) {
        Path path = Paths.get(pathname.toUri());
        try {
            Files.writeString(path, "");
        } catch (IOException e) {
            throw new RuntimeException("File writing error: " + e.getMessage());
        }
    }

    /**
     * Метод записи в файл данных поиска
     *
     * @param bookName      - имя используемой книги
     * @param searchedValue - искомое значение
     * @param count         - количество повторений искомого значения
     */
    public static void writeFile(String bookName, String searchedValue, long count) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("result.txt", true));
            writer.write("Book: " + bookName + "; the searched word: " + searchedValue + " = " + count);
            writer.newLine();
            writer.flush();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException("File writing error: " + e.getMessage());
        }
    }
}

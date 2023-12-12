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
     * @param pathName - путь к папке с книгами
     * @return - возвращает список книг
     */
    public static List<String> folderWithBooks(Path pathName) {
        File folder = new File(pathName.toUri());

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
     * @param str - строка для записи в файл
     */
    public static void writeToFile(String str) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("result.txt", true));) {
            writer.write(str);
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException("File writing error: " + e.getMessage());
        }
    }

    /**
     * Метод вывода содержимого файла в консоль
     */
    public static void printFromFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("result.txt"));
        String read;
        while ((read = reader.readLine()) != null) {
            System.out.println(read);
        }
    }
}

package home_work_6;

import home_work_6.search.EasySearch;
import home_work_6.search.SearchOfSpecificWords;
import home_work_6.utils.TextUtils;
import home_work_6.utils.FileUtils;

import java.io.File;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("The number of words used: " + TextUtils.numOfWord(Path.of("Война и мир_книга.txt")));
        System.out.println();
        System.out.println(TextUtils.findTopUsages(Path.of("Война и мир_книга.txt"), 10));
        System.out.println();
        SearchOfSpecificWords specificWords = new SearchOfSpecificWords();
        System.out.println(specificWords.specificWords());
        System.out.println();

        Scanner in = new Scanner(System.in);
        List<String> books = FileUtils.folderWithBooks(Path.of(getPathToFolder(in)));

        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
        String bookName;
        FileUtils.clearFile(Path.of("result.txt"));

        do {
            System.out.println("Select a book. Or press Enter to exit: ");
            bookName = in.nextLine();
            if ("".equalsIgnoreCase(bookName)) {
                if (checkExit(in)) {
                    break;
                }
            } else {
                if (books.contains(bookName)) {
                    String text = TextUtils.convertFileToStr(Path.of("library" + File.separator + bookName));
                    String searchedValue;

                    do {
                        System.out.println("Enter what you want to find in the book. Or press Enter to exit: ");
                        searchedValue = in.nextLine();
                        if ("".equalsIgnoreCase(searchedValue)) {
                            if (checkExit(in)) {
                                break;
                            }
                        } else {
                            EasySearch easySearch = new EasySearch();
                            FileUtils.writeToFile("Book: " + bookName + "; the searched word: " + searchedValue + " = " + easySearch.search(text, searchedValue));
                            System.out.println("The number of '" + searchedValue + "' = " + easySearch.search(text, searchedValue));
                        }
                    } while (true);
                } else {
                    System.out.println("Incorrectly entered book title!");
                    System.out.println();
                }
            }
        } while (true);
    }

    /**
     * Метод получения пути к папке с книгами и проверки валидности папки
     *
     * @param in - считыватель данных, введенных в консоль
     * @return - возвращаем путь к папке с книгами
     */
    public static String getPathToFolder(Scanner in) {
        String folderPath;
        File file;
        boolean hasError = true;

        do {
            if (!hasError) {
                System.out.println("Incorrect path to folder! ");
            }
            System.out.println("Enter the folder with the books. Or press Enter to exit: ");
            folderPath = in.nextLine();
            hasError = false;
            if ("".equalsIgnoreCase(folderPath)) {
                if (checkExit(in)) {
                    break;
                }
                hasError = true;
            }
            file = new File(folderPath);
        } while (!file.exists() || !file.isDirectory());
        return folderPath;
    }

    /**
     * Метод проверки выхода из программы
     *
     * @param in - введенное значение, идентификатор выхода
     * @return - <code>true</code>, если введенное значение 'y', и <code>false</code> в противном случае
     */
    public static boolean checkExit(Scanner in) {
        System.out.println("Are you sure you want to exit? (Y/N)");
        return "y".equalsIgnoreCase(in.nextLine());
    }

}

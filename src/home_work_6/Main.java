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

        List<String> books = FileUtils.folderWithBooks(Path.of("library"));

        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();

        Scanner in = new Scanner(System.in);
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

                            FileUtils.writeFile(bookName, searchedValue, easySearch.search(text, searchedValue));
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

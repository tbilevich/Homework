package home_work_6;

import home_work_6.task.SearchWord;
import home_work_6.utils.FileUtils;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainForThread {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        List<String> books = FileUtils.folderWithBooks(Path.of(getPathToFolder(in)));

        FileUtils.clearFile(Path.of("result.txt"));
        String searchedValue;
        ExecutorService executorService = Executors.newFixedThreadPool(8);
        List<Future<String>> futures = new ArrayList<>();

        do {
            System.out.println("Enter what you want to find in the books. Or press Enter to exit: ");
            searchedValue = in.nextLine();
            if ("".equalsIgnoreCase(searchedValue)) {
                if (checkExit(in)) {
                    do {
                        try {
                            Iterator<Future<String>> iterator = futures.iterator();
                            while (iterator.hasNext()) {
                                Future<String> future = iterator.next();
                                if (future.isDone()) {
                                    String result = future.get();
                                    FileUtils.writeToFile(result);

                                    iterator.remove();
                                }
                            }
                        } catch (InterruptedException | ExecutionException e) {
                            throw new RuntimeException("An unexpected error has occurred.");
                        }
                    } while (!futures.isEmpty());
                    break;
                }
            } else {
                for (String book : books) {
                    futures.add(executorService.submit(new SearchWord(book, searchedValue)));
                }
            }
        } while (true);

        executorService.shutdown();

        try {
            FileUtils.printFromFile();
        } catch (FileNotFoundException e) {
            System.out.print("The file was not found!");
        } catch (IOException e) {
            System.out.print("File reading error: " + e.getMessage());
        }
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

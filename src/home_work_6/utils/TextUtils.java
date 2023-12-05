package home_work_6.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class TextUtils {
    /**
     * Метод конвертации файла в строку
     *
     * @param pathToFile - путь к файлу
     * @return - возвращает текст из файла строкой
     */
    public static String convertFileToStr(Path pathToFile) {
        List<String> lines = null;
        try {
            lines = Files.readAllLines(pathToFile);
        } catch (IOException e) {
            throw new RuntimeException("File reading error: " + e.getMessage());
        }
        return String.join(" ", lines);
    }

    /**
     * Метод удаления спец.символов
     *
     * @param text - используемый текст
     * @return - возвращает строку без спец.символов
     */
    public static String replaceSpecSymbols(String text) {
        return text.replaceAll("[^а-яА-ЯёЁ\\w]-|-[^а-яА-ЯёЁ\\w]|^-|-$|[^а-яА-ЯёЁ\\w\\s-]", " ").replaceAll("\\s+", " ");
    }

    /**
     * Метод посчета слов в файле
     *
     * @param pathToFile - путь к файлу
     * @return - возвращает количество слов используемых в файле
     */
    public static int numOfWord(Path pathToFile) {
        Set<String> words = new HashSet<>();
        String text = convertFileToStr(pathToFile);
        Collections.addAll(words, replaceSpecSymbols(text).split(" "));
        return words.size();
    }

    /**
     * Метод подсчета количества уникальных слов
     *
     * @param text - используемый текст
     * @return - возвращает набор уникальных слов с количеством использований в данном тексте
     */
    public static Map<String, Long> calcCountOfWords(String text) {
        Map<String, Long> words = new HashMap<>();
        for (String word : replaceSpecSymbols(text).split(" ")) {
            if (words.containsKey(word)) {
                words.put(word, words.get(word) + 1);
            } else {
                words.put(word, 1L);
            }
        }
        return words;
    }

    /**
     * Метод нахождения популярных слов в тексте
     *
     * @param pathToFile - путь к файлу с текстом
     * @param num        - количество требуемых популярных слов
     * @return - возвращает список популярных слов
     */
    public static List<String> findTopUsages(Path pathToFile, int num) {
        String text = convertFileToStr(pathToFile);

        List<Map.Entry<String, Long>> list = new ArrayList<>(calcCountOfWords(text).entrySet());
        list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        List<String> result = new ArrayList<>();
        for (int i = 0; i < list.size() && i < num; i++) {
            result.add(list.get(i).getKey() + " -> " + list.get(i).getValue());
        }
        return result;
    }
}

package home_work_6.search;

import home_work_6.utils.TextUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchTest {
    private EasySearch easySearch = new EasySearch();
    private RegExSearch regExSearch = new RegExSearch();
    private SearchEnginePunctuationNormalizer searchEnginePunctuationNormalizerEasySearch = new SearchEnginePunctuationNormalizer(easySearch);
    private SearchEnginePunctuationNormalizer searchEnginePunctuationNormalizerRegExSearch = new SearchEnginePunctuationNormalizer(regExSearch);


    @Test
    @DisplayName("Проверка easySearch")
    public void easySearchTest() {
        assertEquals(1, easySearch.search("привет, как дела!", "как"));
        assertEquals(0, easySearch.search("привет,какдела!", "как"));
        assertEquals(1, easySearch.search("привет;какдела!", "привет"));
        assertEquals(1, easySearch.search("как дела!.Что делаешь?", "Что"));
        assertEquals(0, easySearch.search("Привет-привет", "привет"));
        assertEquals(1, easySearch.search("Привет-привет", "Привет-привет"));
        assertEquals(1, easySearch.search("Привет -привет", "привет"));
        assertEquals(1, easySearch.search("-привет", "привет"));
        assertEquals(1, easySearch.search("привет-", "привет"));
        assertEquals(1, easySearch.search("Привет--привет", "привет"));
        assertEquals(0, easySearch.search("привет--привет", "привет-привет"));
        assertEquals(2, easySearch.search("привет--привет", "привет"));
        assertEquals(2, easySearch.search("-привет--привет", "привет"));
        assertEquals(0, easySearch.search("где-то", "то"));
        assertEquals(1, easySearch.search("где-то", "где-то"));
        assertEquals(1, easySearch.search("т.д", "т"));
        assertEquals(0, easySearch.search("4-х", "х"));
        assertEquals(1, easySearch.search("один и 1", "1"));
        assertEquals(1, easySearch.search("бабушка бабушке бабушку", "бабушка"));
        assertEquals(0, easySearch.search("бабушка бабушке бабушку", "Бабушка"));
        assertEquals(0, easySearch.search("Мама мыла раму", "мыл"));
        assertEquals(5, easySearch.search("Мама Мама Мама Мама Мама", "Мама"));
        assertEquals(3, easySearch.search("мама Мама мама мама Мама", "мама"));
        assertEquals(2, easySearch.search("мама Мамамама мама Мама", "мама"));
        assertEquals(2, easySearch.search("мамаМама мама мама Мама", "мама"));
        assertEquals(3, easySearch.search("мама!Мама    мама мама; Мама", "мама"));
        assertEquals(1, easySearch.search("мама!Мама    мама мама; Мама", "мама мама"));
    }

    @Test
    @DisplayName("Проверка regExSearch")
    public void regExSearchTest() {
        assertEquals(1, regExSearch.search("привет, как дела!", "как"));
        assertEquals(0, regExSearch.search("привет,какдела!", "как"));
        assertEquals(1, regExSearch.search("привет;какдела!", "привет"));
        assertEquals(1, regExSearch.search("как дела!.Что делаешь?", "Что"));
        assertEquals(0, regExSearch.search("Привет-привет", "привет"));
        assertEquals(1, regExSearch.search("Привет-привет", "Привет-привет"));
        assertEquals(1, regExSearch.search("Привет -привет", "привет"));
        assertEquals(1, regExSearch.search("-привет", "привет"));
        assertEquals(1, regExSearch.search("привет-", "привет"));
        assertEquals(1, regExSearch.search("Привет--привет", "привет"));
        assertEquals(0, regExSearch.search("привет--привет", "привет-привет"));
        assertEquals(2, regExSearch.search("привет--привет", "привет"));
        assertEquals(2, regExSearch.search("-привет--привет", "привет"));
        assertEquals(0, regExSearch.search("где-то", "то"));
        assertEquals(1, regExSearch.search("где-то", "где-то"));
        assertEquals(1, regExSearch.search("т.д", "т"));
        assertEquals(0, regExSearch.search("4-х", "х"));
        assertEquals(1, regExSearch.search("один и 1", "1"));
        assertEquals(1, regExSearch.search("бабушка бабушке бабушку", "бабушка"));
        assertEquals(0, regExSearch.search("бабушка бабушке бабушку", "Бабушка"));
        assertEquals(0, regExSearch.search("Мама мыла раму", "мыл"));
        assertEquals(5, regExSearch.search("Мама Мама Мама Мама Мама", "Мама"));
        assertEquals(3, regExSearch.search("мама Мама мама мама Мама", "мама"));
        assertEquals(2, regExSearch.search("мама Мамамама мама Мама", "мама"));
        assertEquals(2, regExSearch.search("мамаМама мама мама Мама", "мама"));
        assertEquals(3, regExSearch.search("мама!Мама    мама мама; Мама", "мама"));
        assertEquals(1, regExSearch.search("мама!Мама    мама мама; Мама", "мама мама"));
    }

    @Test
    @DisplayName("Проверка SearchEnginePunctuationNormalizer")
    public void searchEnginePunctuationNormalizerTest() {
        assertEquals(1, regExSearch.search("привет, как дела!", "как"));
        assertEquals(0, regExSearch.search("привет,какдела!", "как"));
        assertEquals(1, regExSearch.search("привет;какдела!", "привет"));
        assertEquals(1, regExSearch.search("как дела!.Что делаешь?", "Что"));
        assertEquals(0, regExSearch.search("Привет-привет", "привет"));
        assertEquals(1, regExSearch.search("Привет-привет", "Привет-привет"));
        assertEquals(1, regExSearch.search("Привет -привет", "привет"));
        assertEquals(1, regExSearch.search("-привет", "привет"));
        assertEquals(1, regExSearch.search("привет-", "привет"));
        assertEquals(1, regExSearch.search("Привет--привет", "привет"));
        assertEquals(0, regExSearch.search("привет--привет", "привет-привет"));
        assertEquals(2, regExSearch.search("привет--привет", "привет"));
        assertEquals(2, regExSearch.search("-привет--привет", "привет"));
        assertEquals(0, regExSearch.search("где-то", "то"));
        assertEquals(1, regExSearch.search("где-то", "где-то"));
        assertEquals(1, regExSearch.search("т.д", "т"));
        assertEquals(0, regExSearch.search("4-х", "х"));
        assertEquals(1, regExSearch.search("один и 1", "1"));
        assertEquals(1, regExSearch.search("бабушка бабушке бабушку", "бабушка"));
        assertEquals(0, regExSearch.search("бабушка бабушке бабушку", "Бабушка"));
        assertEquals(0, regExSearch.search("Мама мыла раму", "мыл"));
        assertEquals(5, regExSearch.search("Мама Мама Мама Мама Мама", "Мама"));
        assertEquals(3, regExSearch.search("мама Мама мама мама Мама", "мама"));
        assertEquals(2, regExSearch.search("мама Мамамама мама Мама", "мама"));
        assertEquals(2, regExSearch.search("мамаМама мама мама Мама", "мама"));
        assertEquals(3, regExSearch.search("мама!Мама    мама мама; Мама", "мама"));
        assertEquals(1, regExSearch.search("мама!Мама    мама мама; Мама", "мама мама"));
    }


    @Test
    @DisplayName("Проверка работы метода Utils.calcCountOfWords и кслассов easySearch и regExSearch")
    public void calcCountOfWordsVSSearchesTest() {
        String text = TextUtils.convertFileToStr(Path.of("Война и мир_книга.txt"));

        Map<String, Long> wordCounts = TextUtils.calcCountOfWords(text);

        List<Map.Entry<String, Long>> list = new ArrayList<>(wordCounts.entrySet());
        list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        for (int i = 0; i < list.size() && i < 10; i++) {
            Map.Entry<String, Long> entry = list.get(i);
            assertEquals(easySearch.search(text, entry.getKey()), entry.getValue());
            assertEquals(regExSearch.search(text, entry.getKey()), entry.getValue());
            assertEquals(searchEnginePunctuationNormalizerEasySearch.search(text, entry.getKey()), entry.getValue());
            assertEquals(searchEnginePunctuationNormalizerRegExSearch.search(text, entry.getKey()), entry.getValue());
        }
    }
}
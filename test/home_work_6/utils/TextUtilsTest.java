package home_work_6.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextUtilsTest {
    @Test
    @DisplayName("Проверка replaceSpecSymbols")
    public void replaceSpecSymbolsTest() {
        assertEquals("привет как дела ", TextUtils.replaceSpecSymbols("привет, как дела!"));
        assertEquals("привет какдела ", TextUtils.replaceSpecSymbols("привет,какдела!"));
        assertEquals("привет какдела ", TextUtils.replaceSpecSymbols("привет;какдела!"));
        assertEquals("как дела Что делаешь ", TextUtils.replaceSpecSymbols("как дела!.Что делаешь?"));
        assertEquals("Привет-привет", TextUtils.replaceSpecSymbols("Привет-привет"));
        assertEquals("Привет привет", TextUtils.replaceSpecSymbols("Привет -привет"));
        assertEquals(" привет", TextUtils.replaceSpecSymbols("-привет"));
        assertEquals("привет ", TextUtils.replaceSpecSymbols("привет-"));
        assertEquals("Привет привет", TextUtils.replaceSpecSymbols("Привет--привет"));
        assertEquals(" привет привет", TextUtils.replaceSpecSymbols("-привет--привет"));
        assertEquals("т д", TextUtils.replaceSpecSymbols("т.д"));
       // assertEquals(1, Utils.replaceSpecSymbols("б..н"));
        assertEquals("4-х", TextUtils.replaceSpecSymbols("4-х"));
        assertEquals("мама Мама мама мама Мама", TextUtils.replaceSpecSymbols("мама!Мама    мама мама; Мама"));
    }
}

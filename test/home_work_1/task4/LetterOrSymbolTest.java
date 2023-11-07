package home_work_1.task4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LetterOrSymbolTest {

    @Test
    @DisplayName("Проверка значений для получения англ буквы")
    public void checkEngLetter() {
        assertEquals("Число 65, обозначающее код аглийской буквы A по таблице ASCII", LetterOrSymbol.checkLetterOrSymbol("65"));
        assertEquals("Число 90, обозначающее код аглийской буквы Z по таблице ASCII", LetterOrSymbol.checkLetterOrSymbol("90"));
        assertEquals("Число 97, обозначающее код аглийской буквы a по таблице ASCII", LetterOrSymbol.checkLetterOrSymbol("97"));
        assertEquals("Число 122, обозначающее код аглийской буквы z по таблице ASCII", LetterOrSymbol.checkLetterOrSymbol("122"));
        assertEquals("Число 100, обозначающее код аглийской буквы d по таблице ASCII", LetterOrSymbol.checkLetterOrSymbol("100"));
        assertEquals("Число 78, обозначающее код аглийской буквы N по таблице ASCII", LetterOrSymbol.checkLetterOrSymbol("78"));
    }

    @Test
    @DisplayName("Проверка пограничных значений выходящих за границы диапазона")
    public void checkBoundaryValuesOutOfRange() {
        assertEquals("Число 64, обозначающее код символа @ по таблице ASCII", LetterOrSymbol.checkLetterOrSymbol("64"));
        assertEquals("Число 91, обозначающее код символа [ по таблице ASCII", LetterOrSymbol.checkLetterOrSymbol("91"));
        assertEquals("Число 96, обозначающее код символа ` по таблице ASCII", LetterOrSymbol.checkLetterOrSymbol("96"));
        assertEquals("Число 123, обозначающее код символа { по таблице ASCII", LetterOrSymbol.checkLetterOrSymbol("123"));
    }

    @Test
    @DisplayName("Проверка пограничных значений таблицы ASCII")
    public void checkBoundaryValuesOfASCII() {
        assertEquals("Число 0, обозначающее код символа \u0000 по таблице ASCII", LetterOrSymbol.checkLetterOrSymbol("0"));
        assertEquals("Число 127, обозначающее код символа \u007F по таблице ASCII", LetterOrSymbol.checkLetterOrSymbol("127"));
    }

    @Test
    @DisplayName("Проверка значений невходящих в таблицу ASCII")
    public void checkValuesOutOfASCII() {
        assertEquals("Число 128, обозначающее код символа \u0080 по системе международной кодировки Unicode", LetterOrSymbol.checkLetterOrSymbol("128"));
        assertEquals("Число 567, обозначающее код символа ȷ по системе международной кодировки Unicode", LetterOrSymbol.checkLetterOrSymbol("567"));
    }

    @Test
    @DisplayName("Проверка нецифровых значений")
    public void checkNonDigitalValues() {
        assertEquals("Введенны некорректные данные!", LetterOrSymbol.checkLetterOrSymbol("fghdfh"));
        assertEquals("Введенны некорректные данные!", LetterOrSymbol.checkLetterOrSymbol("null"));
        assertEquals("Введенны некорректные данные!", LetterOrSymbol.checkLetterOrSymbol("45.4.5"));
    }

    @Test
    @DisplayName("Проверка вещественных значений")
    public void checkRealValues() {
        assertEquals("Введенны некорректные данные!", LetterOrSymbol.checkLetterOrSymbol("67,8"));
    }

    @Test
    @DisplayName("Проверка отрицательных значений")
    public void checkNegativeValues() {
        assertEquals("Число должно быть положительным.", LetterOrSymbol.checkLetterOrSymbol("-1"));
        assertEquals("Число должно быть положительным.", LetterOrSymbol.checkLetterOrSymbol("-456"));
    }
}

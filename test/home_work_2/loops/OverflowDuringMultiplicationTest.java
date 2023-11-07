package home_work_2.loops;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OverflowDuringMultiplicationTest {

    @Test
    @DisplayName("Проверка на переполнение")
    public void overflow() {
        assertEquals("The result of multiplying by 3 before overflow is 4052555153018976267. The result of multiplying by 3 after overflow is -6289078614652622815.", OverflowDuringMultiplication.print(3));
        assertEquals("The result of multiplying by 188 before overflow is 1560496482665168896. The result of multiplying by 188 after overflow is -1774566438301073408.", OverflowDuringMultiplication.print(188));
        assertEquals("The result of multiplying by -19 before overflow is 799006685782884121. The result of multiplying by -19 after overflow is 3265617043834753317.", OverflowDuringMultiplication.print(-19));
    }

    @Test
    @DisplayName("Проверка на переполнение для 0")
    public void overflowForZero() {
        assertEquals("The result of multiplying by 0 always is 0. The overflow will never come.", OverflowDuringMultiplication.print(0));
    }

    @Test
    @DisplayName("Проверка на переполнение для 1")
    public void overflowForOne() {
        assertEquals("The result of multiplying by 1 always is 1. The overflow will never come.", OverflowDuringMultiplication.print(1));
    }

    @Test
    @DisplayName("Проверка на переполнение для -1")
    public void overflowForNegativeOne() {
        assertEquals("The result of multiplying by -1 always is \u00B11. The overflow will never come.", OverflowDuringMultiplication.print(-1));
    }
}

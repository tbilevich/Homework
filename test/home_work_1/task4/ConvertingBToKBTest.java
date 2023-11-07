package home_work_1.task4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertingBToKBTest {

    @Test
    @DisplayName("Перевод B в KB")
    public void convertToKB() {
        assertEquals("10000 byte = 9.765625 Kbyte", ConvertingBToKB.print(10000,"B"));
    }

    @Test
    @DisplayName("Перевод KB в B")
    public void convertToB() {
        assertEquals("10 Kbyte = 10240 byte", ConvertingBToKB.print(10,"KB"));
    }

    @Test
    @DisplayName("Перевод byte в KByte")
    public void convertToKByte() {
        assertEquals("10000 byte = 9.765625 Kbyte", ConvertingBToKB.print(10000,"byte"));
    }

    @Test
    @DisplayName("Перевод KByte в byte")
    public void convertToByte() {
        assertEquals("10 Kbyte = 10240 byte", ConvertingBToKB.print(10,"Kbyte"));
    }

    @Test
    @DisplayName("Другая величина измерения")
    public void anotherUnitOfMeasure() {
        assertEquals("You specified incorrect unit of measurement. You should use 'byte' or 'Kbyte'.", ConvertingBToKB.print(25,"M"));
    }
}

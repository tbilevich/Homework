package home_work_1.task7;

import home_work_1.task5.AlarmClock;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneNumberTest {

    @Test
    @DisplayName("Проверка формата номера телефона")
    public void checPhoneNumberFormat() {
        assertEquals("(123) 456-7890", PhoneNumber.createPhoneNumber(new int[]{1,2,3,4,5,6,7,8,9,0}));
    }

    @Test
    @DisplayName("Проверка количества введенных элементов")
    public void checkNumOfEl() {
        assertEquals("Incorrect array length!", PhoneNumber.createPhoneNumber(new int[]{1,2,3,4,5,6,7,8,9}));
        assertEquals("Incorrect array length!", PhoneNumber.createPhoneNumber(new int[]{1,2,3,4,5,6,7,8,9,0,1}));
        assertEquals("Incorrect array length!", PhoneNumber.createPhoneNumber(new int[]{1,2,3,4,5,6,7}));
        assertEquals("Incorrect array length!", PhoneNumber.createPhoneNumber(new int[]{1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0}));
    }

    @Test
    @DisplayName("Проверка валидности элементов")
    public void validationCheck() {
        assertEquals("Incorrect input data!", PhoneNumber.createPhoneNumber(new int[]{-1,2,-3,4,-5,6,-7,8,-9,0}));
        assertEquals("Incorrect input data!", PhoneNumber.createPhoneNumber(new int[]{1,22,3,4,5,6,7,88,9,0}));
    }
}

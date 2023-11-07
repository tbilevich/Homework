package home_work_2.loops;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TasksFromDocTest {

    @Test
    @DisplayName("Нахождение максимальной цифры числа")
    public void maxDigitCheck() {
        assertEquals("Max digit of the number is 8", TasksFromDoc.maxDigitPrint("47586"));
    }

    @Test
    @DisplayName("Проверка натуральности числа в задаче по находению максимальной цифры числа")
    public void naturalNumMaxDigit() {
        assertEquals("Inccorect input data!", TasksFromDoc.maxDigitPrint("num12"));
        assertEquals("Inccorect input data!", TasksFromDoc.maxDigitPrint("null"));
        assertEquals("Inccorect input data!", TasksFromDoc.maxDigitPrint("1,3"));
        assertEquals("Inccorect input data!", TasksFromDoc.maxDigitPrint("5.6"));
        assertEquals("Inccorect input data!", TasksFromDoc.maxDigitPrint("007"));
        assertEquals("Inccorect input data!", TasksFromDoc.maxDigitPrint("0.7"));
    }

    @Test
    @DisplayName("Проверка вероятности четных случайных чисел в массиве п-ого размера")
    public void probabilityEvenNumCheck() {
        boolean probabilityInThousandEl = false;
        if (TasksFromDoc.probabilityEvenNum(1000) > 40 && TasksFromDoc.probabilityEvenNum(1000) < 60) {
            probabilityInThousandEl = true;
        }
        assertTrue(probabilityInThousandEl);

        boolean probabilityInHundredEl = false;
        if (TasksFromDoc.probabilityEvenNum(100) > 30 && TasksFromDoc.probabilityEvenNum(100) < 70) {
            probabilityInHundredEl = true;
        }
        assertTrue(probabilityInHundredEl);

        boolean probabilityInTenEl = false;
        if (TasksFromDoc.probabilityEvenNum(10) > 0 && TasksFromDoc.probabilityEvenNum(10) < 100) {
            probabilityInTenEl = true;
        }
        assertTrue(probabilityInTenEl);

        boolean probabilityInZeroEl = false;
        if (TasksFromDoc.probabilityEvenNum(0) == 0) {
            probabilityInZeroEl = true;
        }
        assertTrue(probabilityInZeroEl);
    }

    @Test
    @DisplayName("Проверка вероятности четных случайных чисел в массиве")
    public void probabilityEvenNumInArrayCheck() {
        assertEquals(60,TasksFromDoc.probabilityEvenNum(new int[]{2,3,4,5,6}));
        assertEquals(16.666666666666668,TasksFromDoc.probabilityEvenNum(new int[]{1,3,47,5,6,9}));
        assertEquals(0,TasksFromDoc.probabilityEvenNum(new int[]{1,1,1,1,1,1,1,1}));
        assertEquals(100,TasksFromDoc.probabilityEvenNum(new int[]{0,0,0}));
        assertEquals(0,TasksFromDoc.probabilityEvenNum(new int[0]));
        assertEquals(0,TasksFromDoc.probabilityEvenNum(null));
        assertEquals(100,TasksFromDoc.probabilityEvenNum(new int[4]));
    }


    @Test
    @DisplayName("Проверка количества четных и нечетных цифр числа")
    public void counterEvenAndOddNumCheck() {
        assertEquals("The number 67948 consist of 3 even digits and 2 odd digits", TasksFromDoc.counterEvenAndOddNumPrint("67948"));
        assertEquals("The number 23410758 consist of 4 even digits and 4 odd digits", TasksFromDoc.counterEvenAndOddNumPrint("23410758"));
    }

    @Test
    @DisplayName("Проверка натуральности числа в задаче по находению максимальной цифры числа")
    public void naturalNumСounterEvenAndOddNum() {
        assertEquals("Inccorect input data!", TasksFromDoc.counterEvenAndOddNumPrint("num12"));
        assertEquals("Inccorect input data!", TasksFromDoc.counterEvenAndOddNumPrint("null"));
        assertEquals("Inccorect input data!", TasksFromDoc.counterEvenAndOddNumPrint("1,3"));
        assertEquals("Inccorect input data!", TasksFromDoc.counterEvenAndOddNumPrint("5.6"));
        assertEquals("Inccorect input data!", TasksFromDoc.counterEvenAndOddNumPrint("007"));
        assertEquals("Inccorect input data!", TasksFromDoc.counterEvenAndOddNumPrint("0.7"));
    }

    @Test
    @DisplayName("Проверка ряда Фибоначчи")
    public void fibonacciSeriesCheck() {
        assertEquals("Fibonacci series from 7 elements: 1 1 2 3 5 8 13 ", TasksFromDoc.fibonacciSeriesPrint(7));
        assertEquals("Fibonacci series from 1 elements: 1", TasksFromDoc.fibonacciSeriesPrint(1));
        assertEquals("Fibonacci series from 2 elements: 1 1", TasksFromDoc.fibonacciSeriesPrint(2));
    }

    @Test
    @DisplayName("Проверка валидности числа для ряда Фибоначчи")
    public void validationCheckNumFibonacciSeries() {
        assertEquals("Incorrect input data!", TasksFromDoc.fibonacciSeriesPrint(-10));
        assertEquals("Incorrect input data!", TasksFromDoc.fibonacciSeriesPrint(0));
    }

    @Test
    @DisplayName("Проверка ряда чисел в диапазоне с заданным шагом")
    public void rowWithIncrementsCheck() {
        assertEquals("A series of numbers in the range [ 23; 45 ] in increments 7 : 23 30 37 44 ", TasksFromDoc.rowWithIncrementsPrint(23,45,7));
        assertEquals("A series of numbers in the range [ 89; 90 ] in increments 1 : 89 90 ", TasksFromDoc.rowWithIncrementsPrint(89,90,1));
        assertEquals("A series of numbers in the range [ -12; 45 ] in increments 2 : -12 -10 -8 -6 -4 -2 0 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 ", TasksFromDoc.rowWithIncrementsPrint(-12, 45, 2));
        assertEquals("A series of numbers in the range [ -78; -56 ] in increments 4 : -78 -74 -70 -66 -62 -58 ", TasksFromDoc.rowWithIncrementsPrint(-78, -56, 4));
        assertEquals("A series of numbers in the range [ 8; 10 ] in increments 2 : 8 10 ", TasksFromDoc.rowWithIncrementsPrint(8,10,2));
    }

    @Test
    @DisplayName("Проверка валидности данных для ряда чисел в диапазоне с заданным шагом")
    public void validationCheckRowWithIncrements() {
        assertEquals("Incorrect input data!", TasksFromDoc.rowWithIncrementsPrint(35,35,5));
        assertEquals("Incorrect input data!", TasksFromDoc.rowWithIncrementsPrint(10, 7, 3));
        assertEquals("Incorrect input data!", TasksFromDoc.rowWithIncrementsPrint(12, -45, 2));
        assertEquals("Incorrect input data!", TasksFromDoc.rowWithIncrementsPrint(12, 45, 0));
        assertEquals("Incorrect input data!", TasksFromDoc.rowWithIncrementsPrint(78, 123, -9));
    }

    @Test
    @DisplayName("Проверка ряда Фибоначчи")
    public void numberReversalCheck() {
        assertEquals("If write the number 6789 backwards, get 9876", TasksFromDoc.numberReversalPrint("6789"));
        assertEquals("If write the number 40978 backwards, get 87904", TasksFromDoc.numberReversalPrint("40978"));
    }

    @Test
    @DisplayName("Проверка валидности числа для ряда Фибоначчи")
    public void naturalNumNumberReversalt() {
        assertEquals("Inccorect input data!", TasksFromDoc.numberReversalPrint("num12"));
        assertEquals("Inccorect input data!", TasksFromDoc.numberReversalPrint("null"));
        assertEquals("Inccorect input data!", TasksFromDoc.numberReversalPrint("1,3"));
        assertEquals("Inccorect input data!", TasksFromDoc.numberReversalPrint("5.6"));
        assertEquals("Inccorect input data!", TasksFromDoc.numberReversalPrint("007"));
        assertEquals("Inccorect input data!", TasksFromDoc.numberReversalPrint("0.7"));
    }
}

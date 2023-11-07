package home_work_2.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayTaskForDocTest {

    @Test
    @DisplayName("Проверка суммы четных положительных элементов массива")
    public void checkSumEvenPositiveElem() {
        assertEquals(34, ArrayTaskForDoc.sumEvenPositiveElem(new int[]{4, 6, 2, 7, 8, 5, 6, 8}));
        assertEquals(12, ArrayTaskForDoc.sumEvenPositiveElem(new int[]{4, -6, -2, 7, -8, 5, -6, 8}));
        assertEquals(4, ArrayTaskForDoc.sumEvenPositiveElem(new int[]{4, -6, -2, -7, -8, 5, -6, -8}));
        assertEquals(0, ArrayTaskForDoc.sumEvenPositiveElem(new int[]{5, 7, 1, 7, 3, 5, 5, 9}));
        assertEquals(0, ArrayTaskForDoc.sumEvenPositiveElem(new int[]{0, 0}));
        assertEquals(0, ArrayTaskForDoc.sumEvenPositiveElem(new int[4]));
        assertEquals(0, ArrayTaskForDoc.sumEvenPositiveElem(new int[0]));
    }

    @Test
    @DisplayName("Проверка нахождения максимального из элементов массива с четным индексом")
    public void checkMaxElemEvenIndex() {
        assertEquals(8, ArrayTaskForDoc.findMaxElemEvenIndex(new int[]{4, 6, 2, 7, 8, 5, 6, 8}));
        assertEquals(4, ArrayTaskForDoc.findMaxElemEvenIndex(new int[]{4, -6, -2, 0, -8, 5, -6, -8}));
        assertEquals(0, ArrayTaskForDoc.findMaxElemEvenIndex(new int[]{-4, -6, -2, -7, -8, -5, -6, -8}));
        assertEquals(0, ArrayTaskForDoc.findMaxElemEvenIndex(new int[]{-5, 7, -1, 7, -3, 5, -5, 9}));
        assertEquals(0, ArrayTaskForDoc.findMaxElemEvenIndex(new int[]{0, 1}));
        assertEquals(0, ArrayTaskForDoc.findMaxElemEvenIndex(new int[4]));
        assertEquals(0, ArrayTaskForDoc.findMaxElemEvenIndex(new int[0]));
    }

    @Test
    @DisplayName("Проверка нахождения элементов массива, которые меньше среднего арифметического")
    public void checkFindElLessArithmeticMean() {
        assertEquals("4 2 5 ", ArrayTaskForDoc.findElLessArithmeticMean(new int[]{4, 6, 2, 7, 8, 5, 6, 8}));
        assertEquals("-6 -8 -6 -8 ", ArrayTaskForDoc.findElLessArithmeticMean(new int[]{4, -6, -2, 0, -8, 5, -6, -8}));
        assertEquals("-6 -7 -8 -6 -8 ", ArrayTaskForDoc.findElLessArithmeticMean(new int[]{-4, -6, -2, -7, -8, -5, -6, -8}));
        assertEquals("", ArrayTaskForDoc.findElLessArithmeticMean(new int[]{1, 1, 1, 1}));
        assertEquals("0 ", ArrayTaskForDoc.findElLessArithmeticMean(new int[]{0, 1}));
        assertEquals("", ArrayTaskForDoc.findElLessArithmeticMean(new int[4]));
        assertEquals("", ArrayTaskForDoc.findElLessArithmeticMean(new int[0]));
    }

    @Test
    @DisplayName("Проверка нахождения двух наименьших (минимальных) элемента массива")
    public void checkFindTwoMinEl() {
        assertEquals("2 and 4", ArrayTaskForDoc.findTwoMinEl(new int[]{4, 6, 2, 7, 8, 5, 6, 8}));
        assertEquals("-8 and -8", ArrayTaskForDoc.findTwoMinEl(new int[]{4, -6, -2, 0, -8, 5, -6, -8}));
        assertEquals("-8 and -7", ArrayTaskForDoc.findTwoMinEl(new int[]{-4, -6, -2, -7, -8, -5, -6}));
        assertEquals("1 and 1", ArrayTaskForDoc.findTwoMinEl(new int[]{1, 1, 1, 1}));
        assertEquals("0 and 1", ArrayTaskForDoc.findTwoMinEl(new int[]{0, 1}));
        assertEquals("The array have to contain two or more elements.", ArrayTaskForDoc.findTwoMinEl(new int[]{1}));
        assertEquals("0 and 0",ArrayTaskForDoc.findTwoMinEl(new int[4]));
        assertEquals("The array have to contain two or more elements.",ArrayTaskForDoc.findTwoMinEl(new int[0]));
    }

    @Test
    @DisplayName("Проверка сжатия массива, удаляя элементы, принадлежащие интервалу")
    public void checkRemoveElArrFromRange() {
        assertEquals("[6, 7, 8, 5, 6, 8, 0, 0]", ArrayTaskForDoc.removeElArrFromRange(new int[]{4, 6, 2, 7, 8, 5, 6, 8}, 2, 4));
        assertEquals("[-4, 0, 9, -6, 0, 0, 0, 0]", ArrayTaskForDoc.removeElArrFromRange(new int[]{-4, 0, 1, 9, 3, 5, -6, 0}, 1, 5));
        assertEquals("[-6, -8, -6, -8, 0, 0, 0, 0]", ArrayTaskForDoc.removeElArrFromRange(new int[]{4, -6, -2, 0, -8, 5, -6, -8}, -2, 5));
        assertEquals("[8, 0, 0, 0, 0, 0, 0, 0]", ArrayTaskForDoc.removeElArrFromRange(new int[]{-4, -6, -2, -7, 8, -5, -6, -8}, -8, -2));
        assertEquals("[0, 0, 0, 0, 0, 0, 0, 0]", ArrayTaskForDoc.removeElArrFromRange(new int[]{-4, -6, -2, -7, -8, -5, -6, -8}, -20, 20));
        assertEquals("[0, 0, 0, 0]", ArrayTaskForDoc.removeElArrFromRange(new int[]{1, 1, 1, 1}, 0, 1));
        assertEquals("[0, 0]", ArrayTaskForDoc.removeElArrFromRange(new int[]{0, 1}, 1, 1));
        assertEquals("[1, 0]", ArrayTaskForDoc.removeElArrFromRange(new int[]{0, 1}, 0, 0));
        assertEquals("[0, 0, 0, 0]",ArrayTaskForDoc.removeElArrFromRange(new int[4], 1, 3));
        assertEquals("[]",ArrayTaskForDoc.removeElArrFromRange(new int[0], -20, 5));
        assertEquals("Incorrect input data!", ArrayTaskForDoc.removeElArrFromRange(new int[]{4, 6, 2, 7, 8, 5, 6, 8}, 4, 2));
    }

    @Test
    @DisplayName("Проверка нахождения суммы цифр массива")
    public void checkSumDigitsInArr() {
        assertEquals(46, ArrayTaskForDoc.sumDigitsInArr(new int[]{4, 6, 2, 7, 8, 5, 6, 8}));
        assertEquals(-21, ArrayTaskForDoc.sumDigitsInArr(new int[]{4, -6, -2, 0, -8, 5, -6, -8}));
        assertEquals(-46, ArrayTaskForDoc.sumDigitsInArr(new int[]{-4, -6, -2, -7, -8, -5, -6, -8}));
        assertEquals(4, ArrayTaskForDoc.sumDigitsInArr(new int[]{1, 1, 1, 1}));
        assertEquals(1, ArrayTaskForDoc.sumDigitsInArr(new int[]{0, 1}));
        assertEquals(0, ArrayTaskForDoc.sumDigitsInArr(new int[4]));
        assertEquals(0, ArrayTaskForDoc.sumDigitsInArr(new int[0]));
    }
}

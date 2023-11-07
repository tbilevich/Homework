package home_work_2.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraysOperationTest {

    @ParameterizedTest
    @DisplayName("Проверка вывода всех элементов массива")
    @MethodSource("loopsProvide")
    public void elementsOfArray(IArraysOperation array) {
        assertEquals("1 2 34 45 6 7 ", array.printElementsOfArray(new int[]{1,2,34,45,6,7}));
        assertEquals("1 ", array.printElementsOfArray(new int[]{1}));
        assertEquals("-1 -2 -34 45 6 7 ", array.printElementsOfArray(new int[]{-1,-2,-34,45,6,7}));
        assertEquals("0 0 ", array.printElementsOfArray(new int[2]));
    }

    @ParameterizedTest
    @DisplayName("Валидность массива")
    @MethodSource("loopsProvide")
    public void validationOfArray(IArraysOperation array) {
        assertEquals("The array is empty!", array.printElementsOfArray(new int[]{}));
        assertEquals("The array is empty!", array.printElementsOfArray(new int[0]));
    }

    @ParameterizedTest
    @DisplayName("Проверка вывода каждого второго элемента массива")
    @MethodSource("loopsProvide")
    public void everySecondElem(IArraysOperation array) {
        assertEquals("2 45 7 ", array.printEverySecondElem(new int[]{1,2,34,45,6,7}));
        assertEquals("7 ", array.printEverySecondElem(new int[]{1,7}));
        assertEquals("-2 45 7 ", array.printEverySecondElem(new int[]{-1,-2,-34,45,6,7}));
    }

    @ParameterizedTest
    @DisplayName("Валидность массива для вывода каждого второго элемента")
    @MethodSource("loopsProvide")
    public void validationOfArrayforPrintEverySecondItem(IArraysOperation array) {
        assertEquals("It is impossible to output the second element of the array when the array length is < 2", array.printEverySecondElem(new int[]{}));
        assertEquals("It is impossible to output the second element of the array when the array length is < 2", array.printEverySecondElem(new int[0]));
        assertEquals("It is impossible to output the second element of the array when the array length is < 2", array.printEverySecondElem(new int[]{8}));
    }

    @ParameterizedTest
    @DisplayName("Проверка вывода массива в обратном порядке")
    @MethodSource("loopsProvide")
    public void arrInReverseOrder(IArraysOperation array) {
        assertEquals("7 6 45 34 2 1 ", array.printArrInReverseOrder(new int[]{1,2,34,45,6,7}));
        assertEquals("1 ", array.printArrInReverseOrder(new int[]{1}));
        assertEquals("7 6 45 -34 -2 -1 ", array.printArrInReverseOrder(new int[]{-1,-2,-34,45,6,7}));
        assertEquals("0 0 ", array.printElementsOfArray(new int[2]));
    }

    @ParameterizedTest
    @DisplayName("Проверка наличия элементов в массиве")
    @MethodSource("loopsProvide")
    public void arrayNotEmpty(IArraysOperation array) {
        assertEquals("The array is empty!", array.printArrInReverseOrder(new int[]{}));
        assertEquals("The array is empty!", array.printArrInReverseOrder(new int[0]));
    }

    private static Stream<Arguments> loopsProvide() {
        return Stream.of(
                Arguments.of(new ForOperation()),
                Arguments.of(new WhileOperation()),
                Arguments.of(new ForEachOperation()),
                Arguments.of(new DoWhileOperation())
        );
    }
}

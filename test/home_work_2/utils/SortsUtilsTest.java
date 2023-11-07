package home_work_2.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortsUtilsTest {

    @Test
    @DisplayName("Проверка пузырьковой сортировки")
    public void checkSort() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        SortsUtils.sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, arr);

        int[] arrSecond = new int[]{1, 1, 1, 1};
        SortsUtils.sort(arrSecond);
        assertArrayEquals(new int[]{1, 1, 1, 1}, arrSecond);

        int[] arrThird = new int[]{9, 1, 5, 99, 9, 9};
        SortsUtils.sort(arrThird);
        assertArrayEquals(new int[]{1, 5, 9, 9, 9, 99}, arrThird);

        int[] arrForth = new int[]{};
        SortsUtils.sort(arrForth);
        assertArrayEquals(new int[]{}, arrForth);

        int[] arrFifth = new int[]{6, 5, 4, 3, 2, 1};
        SortsUtils.sort(arrFifth);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, arrFifth);

        int[] arrSixth = ArraysUtils.arrayRandom(50, 100);
        int[] arrSixthClone = arrSixth.clone();
        SortsUtils.sort(arrSixth);
        Arrays.sort(arrSixthClone);
        assertArrayEquals(arrSixthClone, arrSixth);

        int[] arrSeventh = new int[]{6, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -6};
        SortsUtils.sort(arrSeventh);
        assertArrayEquals(new int[]{-6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6}, arrSeventh);

        int[] arrEighth = new int[]{6};
        SortsUtils.sort(arrEighth);
        assertArrayEquals(new int[]{6}, arrEighth);
    }

    @Test
    @DisplayName("Проверка шейкерной сортировки")
    public void checkShake() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        SortsUtils.shake(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, arr);

        int[] arrSecond = new int[]{1, 1, 1, 1};
        SortsUtils.shake(arrSecond);
        assertArrayEquals(new int[]{1, 1, 1, 1}, arrSecond);

        int[] arrThird = new int[]{9, 1, 5, 99, 9, 9};
        SortsUtils.shake(arrThird);
        assertArrayEquals(new int[]{1, 5, 9, 9, 9, 99}, arrThird);

        int[] arrForth = new int[]{};
        SortsUtils.shake(arrForth);
        assertArrayEquals(new int[]{}, arrForth);

        int[] arrFifth = new int[]{6, 5, 4, 3, 2, 1};
        SortsUtils.shake(arrFifth);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, arrFifth);

        int[] arrSixth = ArraysUtils.arrayRandom(50, 100);
        int[] arrSixthClone = arrSixth.clone();
        SortsUtils.shake(arrSixth);
        Arrays.sort(arrSixthClone);
        assertArrayEquals(arrSixthClone, arrSixth);

        int[] arrSeventh = new int[]{6, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -6};
        SortsUtils.shake(arrSeventh);
        assertArrayEquals(new int[]{-6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6}, arrSeventh);

        int[] arrEighth = new int[]{6};
        SortsUtils.shake(arrEighth);
        assertArrayEquals(new int[]{6}, arrEighth);
    }
}

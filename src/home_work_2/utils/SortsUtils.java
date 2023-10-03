package home_work_2.utils;

public class SortsUtils {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = (arr.length - 1); j > i; j--) {
                int temp = 0;

                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void shake(int[] arr) {
        int leftPosition = 0;
        int rightPosition = arr.length - 1;
        int flag = 1;

        while ((leftPosition < rightPosition) && flag > 0) {
            flag = 0;

            for (int i = leftPosition; i < rightPosition; i++) {
                int temp;

                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = 1;
                }
            }
            rightPosition--;

            for (int i = rightPosition; i > leftPosition; i--) {
                int temp;

                if (arr[i - 1] > arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    flag = 1;
                }
            }
            leftPosition++;
        }
    }
}

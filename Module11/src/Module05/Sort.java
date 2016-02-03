package Module05;

public class Sort {

    public static int[] bubble(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tempValue = array[i];
                    array[i] = array[j];
                    array[j] = tempValue;
                }
            }
        }

        return array;
    }

    public static int[] bubbleOptimized(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            //Тригер перевірки чи були перестановки
            boolean checker = false;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tempValue = array[i];
                    array[i] = array[j];
                    array[j] = tempValue;
                    checker = true;
                }
            }
            if (!checker) {
                return array;
            }
        }

        return array;
    }

    public static int[] cocktail(int[] array) {
        //Ліва (мінімуми) та права (максимуми) границі масива
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            //Переносимо максимум вправо
            for (int i = left; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    int tempValue = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tempValue;
                }
            }

            for (int i = right; i > left; i--) {
                //Переносимо мінімум вліво
                if (array[i] < array[i - 1]) {
                    int tempValue = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tempValue;
                }
            }

            //Звужуємо границі масива
            left++;
            right--;
        }

        return array;
    }

    public static int minimum(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i])
                min = array[i];
        }
        return min;
    }

    public static int maximum(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
        }
        return max;
    }
}
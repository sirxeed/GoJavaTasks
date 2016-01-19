public class Sort {

    public static int[] bubble(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    swap(array, i, j);
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
                    swap(array, i, j);
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
                    swap(array, i, i+1);
                }
            }

            for (int i = right; i > left; i--) {
                //Переносимо мінімум вліво
                if (array[i] < array[i - 1]) {
                    swap(array, i, i-1);
                }
            }

            //Звужуємо границі масива
            left++;
            right--;
        }

        return array;
    }

    public static int[] searching(int[] array) {
        int[] arraySorted = new int[array.length];

        //Шукаємо мінімум та максимум
        int minimum = minimum(array);
        int maximum = maximum(array);

        //Знайдемо скільки разів мінімум зустрічається в масиві
        int index = 0;
        for (int anArray : array) {
            if (anArray == minimum) {
                index++;
            }
        }

        //Заповнимо новий масив мінімумами
        for (int i = 0; i < index; i++) {
            arraySorted[i] = minimum;
        }

        //Знаходимо наступні мінімуми, які більші за попередній
        while (index < arraySorted.length) {
            int minimumNew = maximum;
            for (int anArray : array) {
                if (anArray < minimumNew && anArray > minimum) {
                    minimumNew = anArray;
                }
            }
            minimum = minimumNew;

            //Скільки разів зустрічається даний мінімум
            int indexNew = 0;
            for (int anArray : array) {
                if (anArray == minimum) {
                    indexNew++;
                }
            }
            for (int i = 0; i < indexNew; i++) {
                arraySorted[index + i] = minimum;
            }
            index += indexNew;
        }

        return arraySorted;
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

    public static void swap (int[] array, int i, int j) {
        int tempValue = array[i];
        array[i] = array[j];
        array[j] = tempValue;
    }
}
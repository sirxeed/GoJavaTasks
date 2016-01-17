import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Date;

public class ArraySortApplication {
    public static void main(String[] args) {
        //Створимо масив заданого розміру
        int arraySize = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //arraySize = Integer.parseInt(reader.readLine());

        while (arraySize <= 0) {
            System.out.print("Enter array size: ");
            try {
                try {
                    arraySize = Integer.parseInt(reader.readLine());
                } catch (IOException e) {
                    System.out.println("Please enter a value: ");
                }
            } catch (NumberFormatException f) {
                System.out.println("Entered value is not a digit");
            }
        }

        int[] array = new int[arraySize];

        //NEXT CAN BE USED SEVERAL TIME AND HAVE TO BE MOVED TO A METHOD
        //Заповнимо масив довільними значеннями
        for (int i = 0; i < arraySize; i++) {
            array[i] = (int) (Math.random() * arraySize * 5);
        }

        //Сиворюємо дублікат масиву, з яким будемо працювати
        int[] arraySorted = new int[arraySize];
        arraySorted = array.clone();

        //Для визначення тривалості сортування
        Date time;
        long duration;

        //Виконаємо сортування за зростанням методом бульбашки
        time = new Date();
        arraySorted = Sort.bubble(arraySorted);
        duration = new Date().getTime() - time.getTime();
        System.out.println("Bubble sort method has taken " + duration + "ms");

        //Виконаємо сортування за зростанням методом оптимізованої бульбашки
        arraySorted = array.clone();
        time = new Date();
        arraySorted = Sort.bubbleOptimized(arraySorted);
        duration = new Date().getTime() - time.getTime();
        System.out.println("Optimized bubble sort method has taken " + duration + "ms");

        //Виконаємо сортування за зростанням методом перемішування
        arraySorted = array.clone();
        time = new Date();
        arraySorted = Sort.cocktail(arraySorted);
        duration = new Date().getTime() - time.getTime();
        System.out.println("Cocktail sort method has taken " + duration + "ms");

        //Виконаємо сортування за зростанням використовуючи вбудований метод сортування
        arraySorted = array.clone();
        time = new Date();
        Arrays.sort(arraySorted);
        duration = new Date().getTime() - time.getTime();
        System.out.println("JDK in-built sort method has taken " + duration + "ms");

        //Виконаємо сортування за зростанням використовуючи "мій" метод
        arraySorted = array.clone();
        time = new Date();
        arraySorted = Sort.searching(arraySorted);
        duration = new Date().getTime() - time.getTime();
        System.out.println("My sort method has taken " + duration + "ms");

        //Шукаємо мінімальне та максимальне значення
        System.out.println("Minimum value is: " + arraySorted[0]);
        System.out.println("Maximum value is: " + arraySorted[arraySize - 1]);

        //NEXT CAN BE USED SEVERAL TIME AND HAVE TO BE MOVED TO A METHOD:
        /*
        //Роздрукуємо усі елементи масиву
        for (int i = 0; i < array.length; i++) {
            System.out.println(arraySorted[i] + "       " + array[i]);
        }
        */
    }
}
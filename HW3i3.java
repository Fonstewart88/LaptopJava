// Реализуйте метод, который принимает на вход целочисленный массив arr:
// - Создаёт список ArrayList, заполненный числами из исходого массива arr.
// - Сортирует список по возрастанию и выводит на экран.
// - Находит минимальное значение в списке и выводит на экран - Minimum is {число} - Находит максимальное значение в списке и выводит на экран - Maximum is {число}
// - Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}
// Напишите свой код в методе analyzeNumbers класса Answer. Метод analyzeNumbers принимает на вход один параметр:
// Integer[] arr - массив целых чисел.
package Java_projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HW3i3 {
    public static void main(String[] args) {
        Integer[] arr = {5, 3, 8, 1, 2, 9, 7, 4, 6};

        analyzeNumbers(arr);
    }

    public static void analyzeNumbers(Integer[] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        // Заполняем список

        for (int i = 0; i < arr.length; i++) {

            list.add(arr[i]);

        }

        // Сортируем список по возрастанию

        Collections.sort(list);

        // Выводим список

        System.out.println(list);

        // Находим минимальное значение в списке и выводим на экран

        int min = Collections.min(list);

        System.out.println("Minimum is " + min);

        // Находим максимальное значение в списке и выводим на экран

        int max = Collections.max(list);

        System.out.println("Maximum is " + max);

        // Находим сумму всех значений списка

        int sum = 0;

        for (int i = 0; i < list.size(); i++) {

            sum += list.get(i);

        }

        // Находим среднее арифметическое значений списка и выводим на экран

        double average = (double)sum / list.size();

        System.out.println("Average is = " + average);

    }


}

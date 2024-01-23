
package Java_projects;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionsFramework {
    public static void main(String[] args) {
        // Коллекции

        // ArrayList<Integer> numbers = new ArrayList<>();
        // numbers.add(5);
        // numbers.add(50); // добавление элемента по номеру
        // numbers.add(1, 30); // добавление элемента под определённым номером
        // numbers.remove(2); // Удаление
        // for(Integer el : numbers) {
        //     System.out.println(el);
        // }


        // LinkedList<Float> numbers2 = new LinkedList<>();

        // Функции

        // info("Hello ");
        // summa((short)3, (short)7);
        byte[] nums1 = new byte[] {5, 6, 8, 9, 7};
        System.out.println(summsArr(nums1));

    }

    public static void summa(short a, short b){
        int res = a + b;
        System.out.println("Результат: " + res);
    }


    public static void info(String word){
        System.out.print(word);
        System.out.print("!");
    }

    public static int sum (int a, int b){
        int res = a + b;
        return res;
    }

    public static int summsArr(byte[] arr){
        int summa = 0;
        for (int index = 0; index < arr.length; index++) {
            summa += arr[index];
        }
        return summa;
    }

}

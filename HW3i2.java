package Java_projects;

import java.util.ArrayList;

public class HW3i2 {
    public static void main(String[] args) {
        Integer[] arr = {};
        arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        removeEvenNumbers(arr);
        //System.out.println(removeEvenNumbers(arr));
    }
     public static void removeEvenNumbers(Integer[] arr) {

        ArrayList<Integer> list = new ArrayList<>();



        for (Integer num : arr) {

            if (num % 2 != 0) {

                list.add(num);

            }

        }



        System.out.println(list);

    }
}

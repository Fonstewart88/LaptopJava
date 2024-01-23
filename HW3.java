package Java_projects;

import java.util.Arrays;

public class HW3 {
    public static void main(String[] args) {
        int[] a;
        a = new int[]{5, 1, 6, 2, 3, 4};
        System.out.println(Arrays.toString(mergeSort(a)));
    }

    public static int[] mergeSort(int[] arr) {

        if (arr.length <= 1) {

            return arr; // базовый случай: если длина массива меньше или равна 1, то он уже отсортирован

        }

        

        // разделение массива на две половины

        int middle = arr.length / 2;

        int[] left = new int[middle];

        int[] right = new int[arr.length - middle];

        System.arraycopy(arr, 0, left, 0, middle);

        System.arraycopy(arr, middle, right, 0, arr.length - middle);

        

        left = mergeSort(left); // рекурсивная сортировка первой половины

        right = mergeSort(right); // рекурсивная сортировка второй половины

        

        return merge(left, right); // слияние отсортированных половин

    }

    

    public static int[] merge(int[] left, int[] right) {

        int[] result = new int[left.length + right.length];

        int i = 0, j = 0, k = 0;

        

        // сравниваем элементы из обоих половин и заполняем результирующий массив 

        while (i < left.length && j < right.length) {

            if (left[i] <= right[j]) {

                result[k++] = left[i++];

            } else {

                result[k++] = right[j++];

            }

        }

        

        // копируем оставшиеся элементы из первой половины (если они есть)

        while (i < left.length) {

            result[k++] = left[i++];

        }

        

        // копируем оставшиеся элементы из второй половины (если они есть)

        while (j < right.length) {

            result[k++] = right[j++];

        }

        

        return result;

    }
    
}


package Java_projects;

import java.util.Arrays;

public class File {
    public static void main(String[] args) {
        int[] numbers = new int[] { 1, 7, 3, 5, 2, 6, 4 };
 
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}

public static int[] mergeSort(int[] arr) {

    if (arr.length <= 1) {

        return arr; 
    }

    

  

    int middle = arr.length / 2;

    int[] left = new int[middle];

    int[] right = new int[arr.length - middle];

    System.arraycopy(arr, 0, left, 0, middle);

    System.arraycopy(arr, middle, right, 0, arr.length - middle);

    

    left = mergeSort(left); 

    right = mergeSort(right); 

    

    return merge(left, right); 

}



public static int[] merge(int[] left, int[] right) {

    int[] result = new int[left.length + right.length];

    int i = 0, j = 0, k = 0;

    

    

    while (i < left.length && j < right.length) {

        if (left[i] <= right[j]) {

            result[k++] = left[i++];

        } else {

            result[k++] = right[j++];

        }

    }

    

   

    while (i < left.length) {

        result[k++] = left[i++];

    }

    

    

    while (j < right.length) {

        result[k++] = right[j++];

    }

    

    return result;

}
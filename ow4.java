// Массивы данных

package Java_projects;

import java.util.Scanner;

public class ow4 {
    public static void main(String[] args) {
        
        int[] nums = new int[5];
        nums[0] = 45;
        nums[1] = 32;
        nums[2] = 1;
        nums[3] = 9;
        nums[4] = 3;
        int res = nums[4] + nums[2];


        float[] nums2 = new float[] {5.0f, 4.6f, 8.78f};

        // System.out.println(nums2[2]);

        for (int index = 0; index < nums2.length; index++) {
            //System.out.print(nums2[index]+ " ");
        }

        int[] arr = new int[4];
        Scanner scanner = new Scanner(System.in);
        for (int index = 0; index < arr.length; index++) {
            System.out.print("Введите число: ");
            int value = scanner.nextInt();
            arr[index] = value;
        }
        int min = arr[0];

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] < min) {
                min = arr[index];
            }
        }
        System.out.print("Минимальное число: " + min);

        for (int index = 0; index < arr.length; index++) {
            //System.out.print(nums2[index]+ " ");
        }


    }
}

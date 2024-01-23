package Java_projects;

import java.util.Arrays;

/**
 * program
 */
public class program {
public static void main(String[] args) {
        int[] array = {3, 2, 4};
        int val = 3;

        System.out.println(Arrays.toString(array));

        for (int index = 0; index < array.length; index++) {
            int index2 = array.length;
            if (array[index] == val) {
                if(array[index2] == val){
                    index2--;
                    array[index] = array[index2];
                    array[index2] = val;
                    index2--;
                }
                else{
                    array[index] = array[index2];
                    array[index2] = val;
                    index2--;
                }
                
            }
            
        }
        System.out.println(array);
}
    
}
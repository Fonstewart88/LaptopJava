// Задание №3
// Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести
//эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива
// должны быть отличны от заданного, а остальные - равны ему




package Java_projects;

import java.util.Arrays;

public class Sem11 {
    public static void main(String[] args) {
        int[] array = {3, 2, 4, 3, 5, 8, 9, 8, 3, 1, 2, 3, 4};
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
        System.out.println(Arrays.toString(array));


    }
    
}

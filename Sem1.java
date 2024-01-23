// Настроить проект, вывести в консоль  "Hello world"
// Вывести в консоль системные дату и время.
package Java_projects;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Sem1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        /*            // Закомментированно
        // Настроить проект, вывести в консоль  "Hello world"
        // Вывести в консоль системные дату и время.
        System.out.println("Hello world");
        System.out.println(LocalDateTime.now());
        
        int num = 45654;
        double dNum = 5.78;
        String str = "Hello";
        char ch = 'g';
        boolean b = true;

        while (b) {
            break;
        }
        int[] array = new int[8];
        int[] array1 = {5,5,3,1,5,8,7,9};
        for (int item : array1) {
            System.out.print(item + " ");
        }

        if (5 > 3) {
            
        }
        else if (6 < 4) {
            
        }
        */


        /* 
        // Написать программу, которая запросит пользователя ввести имя в консоль
        // Полусит введённую строку и выведет в консоль сообщение "Привет, <Имя>!"
        System.out.print("Представьтесь, пожалуйста: ");
        Scanner scanner = new Scanner(System.in,"ibm866");
        String name = scanner.nextLine();
        // System.out.println("Привет, "+ name + "!");
        System.out.printf("Привет, %s!", name); // этот вариант лучше
        scanner.close();
        */

        // Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.

        int[] array = {1,0,1,1,1,1};
        int max = extracted(array);
         System.out.println(max);


    }

    private static int extracted(int[] array) {
        int count = 0;
        int max = 0;
        for (int i : array) {
            if(i == 1){
                ++count;
                if (max < count) {
                    max = count;
                }
            }
            else{
                max = count;
                count = 0;
            }
            
        }
        return max;
        
    }
}

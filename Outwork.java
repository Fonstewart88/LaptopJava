package Java_projects;

import java.util.Scanner;

public class Outwork {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.print("Введите имя: ");
//        String username = scan.nextLine();
//        System.out.println("Привет, " + username);
//        int num1 = scan.nextInt();
//        byte num2 = scan.nextByte();
//        boolean b = scan.hasNextBoolean();
//        float num3 = scan.nextFloat();
//    short num1 = 5, num2 = 40;
//    int res = num1 + num2;
//    System.out.println("Результат: " + res);
    int a = 2, b = 10, c = 7;
    if (a == b || b == c || a == c) {
        System.out.println("Сценарий 1");
    } else if (a == c) {
        System.out.println("Сценарий 2");
    } else if (a <= b && c <= b) {
        System.out.println("Сценарий 3");
    } else if (a >= b) {
        System.out.println("Сценарий 4");
    } else {
        System.out.println("Сценарий 5");
    }



        

    }
    
}

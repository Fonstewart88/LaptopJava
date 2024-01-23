package Java_projects;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("число ");
        int num = scan.nextInt();
        switch (num) {
            case 1:
            System.out.print("Номер 1");
                break;
            case 2:
            System.out.print("Номер 2");
                break;    
            case 3:
            System.out.print("Номер 3");
                break;
            default:
                break;
        }
    }
    
}

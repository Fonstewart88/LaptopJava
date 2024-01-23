package Java_projects;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        //
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите роль: ");
        String role = scan.nextLine();
        System.out.print("Введите четырёхзначный пароль: ");
        String pass = scan.nextLine();
        String trPass = "1234";
        if (role.equals("admin") || role.equals("Admin")) {
            if (pass.equals(trPass)) {
                System.out.print("Привет, Хозяин");
            }
            System.out.print("Неверный пароль");
        } else if (role.equals("admin") || role.equals("Admin")) {
            System.out.print("Неверный пароль");
        } else{
            System.out.print("Привет, как вас зовут: ");
            String name = scan.nextLine();
        }


    }
}

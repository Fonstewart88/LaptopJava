// Задание №1
// Реализовать консольное приложение, которое:
// 1. Принимает от пользователя строку вида
// text~num
// 2. Нужно рассплитить строку по ~, сохранить text в связный список на
// позицию num.
// 3. Если введено print~num, выводит строку из позиции num в связном
// списке и удаляет её из списка.

package Java_projects;

import java.util.LinkedList;
import java.util.Scanner;

public class sem4i1 {
    public static void main(String[] args) {
        System.out.println("Введите строку вида text~num");
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> userList = new LinkedList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }
            String[] inpSplit = input.split("~");
            String text = inpSplit[0];
            int num = Integer.parseInt(inpSplit[1]);
            if (text.equals("print")) {
                System.out.println(userList.get(num));
                userList.remove(num);

            }
            else{
                userList.add(num, text);
                System.out.println(userList);
            }
        }

    }
}

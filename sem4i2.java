package Java_projects;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javax.xml.transform.stax.StAXSource;

public class sem4i2 {
    public static void main(String[] args) {
        // 1) Написать метод, который принимает массив элементов, помещает их в стэк
        // и выводит на консоль содержимое стэка.
        // 2) Написать метод, который принимает массив элементов, помещает их в
        // очередь и выводит на консоль содержимое очереди

        int[] elements = {1, 2, 3, 4, 5};
        Stack<Integer> stack = new Stack<>();
        for(Integer element : elements){
            stack.push(element);
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + ", ");
        }
        System.out.println();

        Queue<Integer> queue = new LinkedList<>();
        for (Integer element : elements){
            queue.add(element);

        }
        System.out.println(queue);
    }
}

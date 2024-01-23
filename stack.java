package Java_projects;

public class stack {
    static int[] array;
    static int capacity;
    static int topIndex;


    public static void main(String[] args) {
        capacity = 5;
        array = new int[capacity];
        topIndex = -1;
        System.out.println(empty());
        push(5);
        push(1);
        push(4);
        System.out.println(size());
        System.out.println(peek());
        System.out.println(size());
    }
    public static int size() {
        return topIndex +1;
    }

    public static boolean empty() {
        return topIndex== -1;
    }

    public static void push(int num) {
        array[++topIndex] = num;
    }

    public static int peek() {
        return array[topIndex--];
    }

}

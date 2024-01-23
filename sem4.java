package Java_projects;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class sem4 {
    public static void main(String[] args) {
        int count = 100000;

        System.out.println("Добавление в конец списка: ");
        long start = System.currentTimeMillis();
        filArrayListLast(count);
        System.out.println("ArrayListLast: " + (System.currentTimeMillis() - start));

        long start1 = System.currentTimeMillis();
        filLinkedListLast(count);
        System.out.println("LinkedListLast: " + (System.currentTimeMillis() - start1));
        System.out.println();
        System.out.println("Добавление в начало списка: ");
        long start2 = System.currentTimeMillis();
        filArrayListFirst(count);
        System.out.println("ArrayListFirst: " + (System.currentTimeMillis() - start2));

        long start3 = System.currentTimeMillis();
        filLinkedListFirst(count);
        System.out.println("LinkedListFirst: " + (System.currentTimeMillis() - start3));
        System.out.println();
        System.out.println("Добавление в середину списка: ");
        long start4 = System.currentTimeMillis();
        filArrayListMiddle(count);
        System.out.println("ArrayListMiddle: " + (System.currentTimeMillis() - start4));

        long start5 = System.currentTimeMillis();
        filLinkedListMiddle(count);
        System.out.println("LinkedListMiddle: " + (System.currentTimeMillis() - start5));
    }

    public static ArrayList<Integer> filArrayListLast(int count){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            arrayList.addLast(i);
    
        }
        return arrayList;
    }

    public static LinkedList<Integer> filLinkedListLast(int count){
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            linkedList.addLast(i);
    
        }
        return linkedList;
    }

    public static ArrayList<Integer> filArrayListFirst(int count){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            arrayList.addFirst(i);
    
        }
        return arrayList;
    }

    public static LinkedList<Integer> filLinkedListFirst(int count){
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            linkedList.addFirst(i);
    
        }
        return linkedList;
    }
    public static ArrayList<Integer> filArrayListMiddle(int count){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            arrayList.add(arrayList.size()/2, i);
    
        }
        return arrayList;
    }
    
    public static LinkedList<Integer> filLinkedListMiddle(int count){
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            linkedList.add(linkedList.size()/2, i);
    
        }
        return linkedList;
    }        
}

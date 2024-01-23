package Java_projects;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;


public class planet {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>();
        planets.add("A");
        planets.add("B");
        planets.add("B");
        planets.add("C");
        planets.add("A");
        planets.add("D");
        planets.add("D");
        planets.add("A");
        planets.add("B");
        planets.add("E");
        planets.add("E");
        planets.add("F");
        planets.add("B");
        planets.add("A");
        planets.add("C");
        planets.add("E");
        planets.add("D");

        System.out.println(planets);
        Collections.sort(planets);
        plan(planets);

    }
    public static void plan(ArrayList<String> planets){
        Collections.sort(planets);
        System.out.println(planets);

        int counter = planets.size();
        System.out.println(counter);
        while (counter > 0) {
            for (int i = 0; i < counter; i++) {
                String t = planets.get(i);
                if (planets.get(i).equals(t)) {
                    
                }

            }
        }

        
    }
}

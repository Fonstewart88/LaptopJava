//Циклы


package Java_projects;

public class OW3 {
    public static void main(String[] args) {
        // for
        for (int i = 0; i < 10; i++) {
            //System.out.println("Element: " + i);
        }
        // while
        int a = 0;
        while (a <= 5) {
            //System.out.println("Element: " + a);
            a ++;
        }

        // do while
        int d = 0;
        do {
            //System.out.println("Element: " + d);
            d ++;
        } while (d < 10);

        for (int i = 5; i < 25; i += 2) {
            if (i % 3 == 0) {
                continue;
                
            }
            if (i >= 19) {
                break;
                
            }
            System.out.println("Element: " + i);
        }









    }
}

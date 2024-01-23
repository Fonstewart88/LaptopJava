
// Дано четное число N (>0) и символы c1 и c2
// Написать метод, который вернет строку длины N, которая
// состоит из чередующихся символов c1 и c2, начиная с c1.

package Java_projects;

public class sem2 {
    public static void main(String[] args) {
        int n = 1000;
        char c1 = 'a';
        char c2 = 'z';
        long start = System.currentTimeMillis();
        System.out.println(altchar(n, c1, c2));
        System.out.println(System.currentTimeMillis() - start);
        long start2 = System.currentTimeMillis();
        System.out.println(altcharSb(n, c1, c2));
        System.out.println(System.currentTimeMillis() - start2);

    }

    public static String altchar(int n, char c1, char c2) {
        String str = "";
        for (int index = 0; index < n / 2; index++) {
            str += Character.toString(c1) + Character.toString(c2);
        }

        return str;
    }

    public static String altcharSb(int n, char c1, char c2) {
        StringBuilder sb = new StringBuilder(n);

        for (int index = 0; index < n / 2; index++) {
            sb.append(c1).append(c2);
            
        }
        return sb.toString();
        
    }




}

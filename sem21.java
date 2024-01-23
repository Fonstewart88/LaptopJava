// Задание №2
// Напишите метод, который сжимает строку.
// Пример: вход aaaabbbcdd.

package Java_projects;

public class sem21 {
    public static void main(String[] args) {
         String inputStr = 'aaaabbbcdd';
         System.out.println(altchar(inputStr));


        
    }
    
/**
 * @param str
 * @return
 */
public static String altchar(String str) {
    StringBuilder sb = new StringBuilder();
    int count = 1;
    sb.append(str.charAt(0));
    for (int i = 1; i < str.length(); i++) {
        if (str.charAt(i-1) == str.charAt(i)) {
            count++;
        }
        else{
            sb.append(str.charAt(i));
            sb.append(count);
            count++;
        }
    return sb.toString();    
    }

}

}

// Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными
// и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на
// некоторую букву во втором слове, при этом
// 1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением
// порядка следования. (Например, add - egg изоморфны)
// 2. буква может не меняться, а остаться такой же. (Например, note - code)
// Пример 1:
// Input: s = "foo", t = "bar"
// Output: false
// Пример 2:
// Input: s = "paper", t = "title"
// Output: true

package Java_projects;

import java.util.HashMap;
import java.util.Map;

public class Sem5Zad1 {
    public static void main(String[] args) {
        String s = "paper";
        String t = "title";
        System.out.println(isomorphicCheck(s, t));
    }
    public static boolean isomorphicCheck(String str1, String str2) {
        boolean result = true;
        if(str1.length() != str2.length()) {
            return false;
        }
        if (str1.equals(str2)) {
            return true;
        }
        Map<Character, Character> hashCheck = new HashMap<>();
        for (int i = 0; i < str1.length; i++) {
            if (hashCheck.containsKey(str1.charAt(i))) {
                if (hashCheck.get(str1.charAt(i)) != str2.charAt(i)) {
                    return false;
                }
            }
            else hashCheck.put(str1.charAt(i), str2.charAt(i));
        }
        return result;
    }

}

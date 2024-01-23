// Создать структуру для хранения Номеров паспортов и Фамилий
// сотрудников организации.
// 123456 Иванов
// 321456 Васильев
// 234561 Петрова
// 234432 Иванов
// 654321 Петрова
// 345678 Иванов
// Вывести данные по сотрудникам с фамилией Иванов.
package Java_projects;

import java.util.HashMap;
import java.util.Map;

public class Sem5HashMap {
    public static void main(String[] args) {
        Map<Integer, String> pasportData = new HashMap<>();
        pasportData.put(123456, "Иванов");
        pasportData.put(321456, "Васильев");
        pasportData.put(234561, "Петрова");
        pasportData.put(234432, "Иванов");
        pasportData.put(654321, "Петрова");
        pasportData.put(345678, "Иванов");

        String targetName = "Иванов";

        for (Integer pasportNumber : pasportData.keySet()) {
            String name = pasportData.get(pasportNumber);
            if(name.equals(targetName)) {
                System.out.println("Номер паспорта: " + pasportNumber + ", Фамилия: " + name);
            }
        }
    }
}

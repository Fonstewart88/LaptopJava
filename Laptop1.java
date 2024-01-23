import java.util.HashSet;

import java.util.Map;

import java.util.Scanner;

import java.util.Set;


public class Laptop1 {

    private int ram;

    private int hdd;

    private String os;

    private String color;

    public Laptop(int ram, int hdd, String os, String color) {

        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;

    }

    public int getRam() {
        return ram;

    }

    public int getHdd() {
        return hdd;

    }

    public String getOs() {
        return os;

    }

    public String getColor() {
        return color;

    }

}

public class LaptopFilter {

    private Set<Laptop> laptops = new HashSet<>();



    public void addLaptop(Laptop laptop) {

        laptops.add(laptop);

    }



    public void filterLaptops() {

        Map&lt;String, String&gt; filterCriteria = getFilterCriteria();



        Set&lt;Laptop&gt; filteredLaptops = new HashSet&lt;&gt;();

        for (Laptop laptop : laptops) {

            boolean meetsCriteria = true;



            for (String criterion : filterCriteria.keySet()) {

                String value = filterCriteria.get(criterion);



                if (criterion.equals(&quot;1&quot;) &amp;&amp; laptop.getRam() &lt; Integer.parseInt(value)) {

                    meetsCriteria = false;

                } else if (criterion.equals(&quot;2&quot;) &amp;&amp; laptop.getHdd() &lt; Integer.parseInt(value)) {

                    meetsCriteria = false;

                } else if (criterion.equals(&quot;3&quot;) &amp;&amp; !laptop.getOs().equals(value)) {

                    meetsCriteria = false;

                } else if (criterion.equals(&quot;4&quot;) &amp;&amp; !laptop.getColor().equals(value)) {

                    meetsCriteria = false;

                }

            }



            if (meetsCriteria) {

                filteredLaptops.add(laptop);

            }

        }



        for (Laptop filteredLaptop : filteredLaptops) {

            System.out.println(filteredLaptop.getOs() + &quot;, &quot; + filteredLaptop.getColor() +

                    &quot;, &quot; + filteredLaptop.getRam() + &quot;, &quot; + filteredLaptop.getHdd());

        }

    }



    private Map&lt;String, String&gt; getFilterCriteria() {

        Scanner scanner = new Scanner(System.in);

        Map&lt;String, String&gt; filterCriteria = new HashMap&lt;&gt;();



        System.out.println(&quot;Введите цифру, соответствующую необходимому критерию:n&quot; +

                &quot;1 - ОЗУn2 - Объем ЖДn3 - Операционная системаn4 - Цвет&quot;);



        String criterion = scanner.nextLine();

        filterCriteria.put(criterion, getMinimumValue(criterion));



        return filterCriteria;

    }



    private String getMinimumValue(String criterion) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(&quot;Введите минимальное значение для критерия &quot; + criterion + &quot;:&quot;);

        return scanner.nextLine();

    }



    public static void main(String[] args) {

        LaptopFilter laptopFilter = new LaptopFilter();



        Laptop laptop1 = new Laptop(8, 512, &quot;Windows 10&quot;, &quot;Серый&quot;);

        Laptop laptop2 = new Laptop(16, 1024, &quot;MacOS&quot;, &quot;Серебристый&quot;);

        Laptop laptop3 = new Laptop(4, 256, &quot;Ubuntu&quot;, &quot;Черный&quot;);



        laptopFilter.addLaptop(laptop1);

        laptopFilter.addLaptop(laptop2);

        laptopFilter.addLaptop(laptop3);



        laptopFilter.filterLaptops();

    }

}

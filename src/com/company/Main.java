package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        // Опциональные айтомы
        // ищет вариации (может быть или не быть)
        //здесь он найдет выбор u или r, при этом можно и вместе
        // найдет color и colour
        Pattern p1 = Pattern.compile("colou?r");
        Matcher m1 = p1.matcher("color colour");
        while (m1.find()){
            System.out.println(m1.start() +" "+ m1.group()+" ");
        }

        // ? Жадный, если нашёл совпадение то будет проверять все условия
        // найдет November и Nov
        Pattern p2 = Pattern.compile("Nov(ember)?");
        Matcher m2 = p2.matcher("November Nov");
        while (m2.find()){
            System.out.println(m2.start() +" "+ m2.group()+" ");
        }

        // ?? не жадный, если нашёл то пойдет дальше
        // найдет Nov и Nov
        Pattern p3 = Pattern.compile("Nov(ember)??");
        Matcher m3 = p3.matcher("November Nov");
        while (m3.find()){
            System.out.println(m3.start() +" "+ m3.group()+" ");
        }

        // найдет всё
        Pattern p4 = Pattern.compile("Feb(rary)? 23(rd)?");
        Matcher m4 = p4.matcher("Febrary 23rd, Febrary 23, Feb 23rd, Feb 23");
        while (m4.find()){
            System.out.println(m4.start() +" "+ m4.group()+" ");
        }
    }
}

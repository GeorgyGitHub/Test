package com.company;

import java.util.*;



public class Calc {
////функция исключение////
    public static void exception(String except) {
        System.out.println(except);
        System.exit (1);
    }
    static String except3 = " throws Exception строка не является математической операцией или не удовлетворяет заданию ";
    public static void main(String[]args) {

        System.out.println("Калькулятор запущен вам доступны  операции (+ , - , / , *) с арабскими и римскими цифрами 0 - 10 или  0 - X включительно");

        for(int j = 0; j < 1;) {
            Arab ArabInt = new Arab();
            Rom RomInt = new Rom();

            Scanner UserString = new Scanner(System.in, "Cp1251");
            String str = UserString.nextLine();
            if(str.contains("-") || str.contains("+") || str.contains("*") || str.contains("/")){
                ArabInt.Summ(str);
                RomInt.Summ(str);
            } else {exception(except3);}

        }
    }
}



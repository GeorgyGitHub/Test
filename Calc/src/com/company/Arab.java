package com.company;
///////////////////////////////////////////////////Работа с арабскими цифрами///////////////////////////////////////////////////
import static com.company.Calc.exception;
import static java.lang.Integer.parseInt;

public class Arab {
    String except = " throws Exception используються одновременно разные системы счисления";
    String except1 = " throws Exception числа больше 10 запрещены";
    String except2 = " throws Exception В римской системе нет отрицательных чисел";

    public void Summ (String str) {
        if (str.matches("[a-zA-Z ]*\\d+.*")) {
            for (int i = 0; i < 1; ) {
                if (str.contains("-")) {

                    String[] massArb = str.split("-");

                    if (parseInt(massArb[0]) > 10 || parseInt(massArb[1]) > 10) {
                        exception(except1);
                    }
                    int result = parseInt(massArb[0]) - parseInt(massArb[1]);
                    System.out.println(result);
                    i++;
                }

                if (str.contains("+")) {
                    String[] massArb = str.split("\\+");

                    if (parseInt(massArb[0]) > 10 || parseInt(massArb[1]) > 10) {
                        exception(except1);
                    }
                    int result = parseInt(massArb[0]) + parseInt(massArb[1]);
                    System.out.println(result);
                    i++;
                }

                if (str.contains("/")) {
                    String[] massArb = str.split("/");

                    if (parseInt(massArb[0]) > 10 || parseInt(massArb[1]) > 10) {
                        exception(except1);
                    }
                    int result = parseInt(massArb[0]) / parseInt(massArb[1]);
                    System.out.println(result);
                    i++;
                }

                if (str.contains("*")) {
                    String[] massArb = str.split("\\*");

                    if (parseInt(massArb[0]) > 10 || parseInt(massArb[1]) > 10) {
                        exception(except1);
                    }
                    int result = parseInt(massArb[0]) * parseInt(massArb[1]);
                    System.out.println(result);
                    i++;
                }
            }
        }
    }
}

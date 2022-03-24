package com.company;
///////////////////////////////////////////////////Работа с римскими цифрами///////////////////////////////////////////////////
import static com.company.Calc.exception;
import static com.company.ConvertArbRim.Roman;
import static com.company.ConvertArbRim.convertRoman;
import static java.lang.Integer.parseInt;

public class Rom {
    String except = " throws Exception используються одновременно разные системы счисления";
    String except1 = " throws Exception числа больше 10 запрещены";
    String except2 = " throws Exception В римской системе нет отрицательных чисел";
    public void Summ(String str) {
        if (!str.matches("[a-zA-Z ]*\\d+.*")) {
            for (int k = 0; k < 1; ) {
                if (str.contains("-")) {
                    String[] massRom = str.split("-");
                    String R1 = massRom[0];
                    String R2 = massRom[1];
                    int R3 = Roman(R1);
                    int R4 = Roman(R2);

                    if (str.contains("1") || str.contains("2") ||str.contains("3") ||str.contains("4") ||str.contains("5") ||str.contains("6") ||str.contains("7") ||str.contains("8") ||str.contains("9") ||str.contains("10")) {
                        exception(except);
                    }

                    if (R3 < 1 ||R4 < 1 ) {
                        exception(except2);
                    }
                    if (R3 > 10 || R4 > 10) {
                        exception(except1);
                    }
                    int RomanConvert = Roman(R1) - Roman(R2);
                    if (RomanConvert < 1) {
                        exception(except2);
                    }
                    System.out.println(convertRoman(RomanConvert));
                    k++;
                }

                if (str.contains("+")) {
                    String[] massRom = str.split("\\+");
                    String R1 = massRom[0];
                    String R2 = massRom[1];
                    int R3 = Roman(R1);
                    int R4 = Roman(R2);

                    if (str.contains("1") || str.contains("2") ||str.contains("3") ||str.contains("4") ||str.contains("5") ||str.contains("6") ||str.contains("7") ||str.contains("8") ||str.contains("9") ||str.contains("10")) {
                        exception(except);
                    }

                    if (R3 < 1 ||R4 < 1 ) {
                        exception(except2);
                    }
                    if (R3 > 10 || R4 > 10) {
                        exception(except1);
                    }
                    int RomanConvert = Roman(R1) + Roman(R2);
                    if (RomanConvert < 1) {
                        exception(except2);
                    }
                    System.out.println(convertRoman(RomanConvert));
                    k++;
                }

                if (str.contains("/")) {
                    String[] massRom = str.split("/");
                    String R1 = massRom[0];
                    String R2 = massRom[1];
                    int R3 = Roman(R1);
                    int R4 = Roman(R2);

                    if (str.contains("1") || str.contains("2") ||str.contains("3") ||str.contains("4") ||str.contains("5") ||str.contains("6") ||str.contains("7") ||str.contains("8") ||str.contains("9") ||str.contains("10")) {
                        exception(except);
                    }

                    if (R3 < 1 ||R4 < 1 ) {
                        exception(except2);
                    }

                    if (R3 > 10 || R4 > 10) {
                        exception(except1);
                    }
                    int RomanConvert = Roman(R1) / Roman(R2);
                    if (RomanConvert < 1) {
                        exception(except2);
                    }
                    System.out.println(convertRoman(RomanConvert));
                    k++;
                }

                if (str.contains("*")) {
                    String[] massRom = str.split("\\*");
                    String R1 = massRom[0];
                    String R2 = massRom[1];
                    int R3 = Roman(R1);
                    int R4 = Roman(R2);

                    if (str.contains("1") || str.contains("2") ||str.contains("3") ||str.contains("4") ||str.contains("5") ||str.contains("6") ||str.contains("7") ||str.contains("8") ||str.contains("9") ||str.contains("10")) {
                        exception(except);
                    }

                    if (R3 < 1 ||R4 < 1 ) {
                        exception(except2);
                    }

                    if (R3 > 10 || R4 > 10) {
                        exception(except1);
                    }
                    int RomanConvert = Roman(R1) * Roman(R2);
                    if (RomanConvert < 1) {
                        exception(except2);
                    }
                    System.out.println(convertRoman(RomanConvert));
                    k++;
                }
            }
        }
    }
}

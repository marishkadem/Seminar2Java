
package Homework;

import java.util.Arrays;
public class Task1 {


    public static void main(String[] args) {
        String str = "кабак";
        wordToArray(str);
    }

    public static void wordToArray(String str) {
        String[] strArr = str.split("");
        String[] strArrBackwards = new String[strArr.length];
        int j = 0;
        for (int i = strArr.length - 1; i >= 0; i--) {
            strArrBackwards[j] = strArr[i];
            j++;
        }
        if (Arrays.equals(strArr, strArrBackwards)) {
            System.out.println("Слово " + str + " является полиндромом");
        } else {
            System.out.println("Слово " + str + " НЕ является полиндромом");
        }
    }


}



package Homeworks.HW3;

import java.util.Scanner;

public class KonvEuroDoll {
    public static void main(String[] args) {

        
        // №3
        //Программа запрашивает у пользователя сумму в Евро для конвертации
       // Реализовать метод, который конвертирует полученную сумму в сумму в долларах США
        Scanner konv = new Scanner(System.in);
        System.out.println("Enter summ EU  "  );
        double basVal = konv.nextInt();
        System.out.println("Sum $ = " + konEuroDoll(basVal));
    }
    public static double konEuroDoll(double basVal) {
        double eu = basVal * 1.1;
        return eu;
    }
}

package Homeworks.HW4;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        /*У вас на банковском счету N долларов.
Вы хотите снять все, но банк разрешает снять только сумму,
 которая является делителем текущей суммы на счету и меньше текущей суммы.
Если вы снимаете максимально возможную сумму каждый день,
 сколько дней вам понадобится, чтобы забрать все свои деньги из банка?
Примечание: если оставшаяся сумма равна 1, вы можете снять ее.
Ввод:  N = 21
Выход:  7
*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int n= scanner.nextInt();
        getMaxDivisor(n);
    }

    private static void getMaxDivisor(int n) {
        if (n ==1) {
            System.out.println("Вы можете снять " + n); }

        for (int i = n - 1; i >= 1; i--) {
                if (n % i == 0) {
                    System.out.println("Снято " + i);
                    return;
                }

        }

    }     

    }





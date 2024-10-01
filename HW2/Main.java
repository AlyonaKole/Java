package Homeworks.HW2;

public class Main {
    public static void main(String[] args) {






        //Создайте строку через new - I study Basic Java!

        String basic = new String("I study Basic Java!");
        //Распечатать пред-последний символ строки. Используем метод String.charAt().
        System.out.println(basic.charAt((basic.length() - 1)));

        //Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
        System.out.println(basic.contains("Java"));

        //Вырезать строку Java c помощью метода String.substring().
        System.out.println(basic.substring(1, 10));

        //Заменить все символы “а” на “о”.
        System.out.println(basic.replace('a', 'o'));

        //Преобразуйте строку к верхнему регистру.
        System.out.println(basic.toUpperCase());

        //Преобразуйте строку к нижнему регистру.
        System.out.println(basic.toLowerCase());

        //_________________№ 2-----------------------------------


        // Создайте методы с математическими операциями +, -, *, /
        //Каждый метод принимает два числа в параметрах и возвращает результат

        // Вызовите все методы в main
        //Результат распечатайте в консоль
    

        int a = 10;
        int b = 5;
        int sum = getSum(a, b);
        int sub = getSub(a, b);
        int mult = getMult(a, b);
        int div = getDiv(a, b);

        System.out.println("Сумма = "  + sum);
        System.out.println("Вычитание = " + sub);
        System.out.println("Умножение = " + mult);
        System.out.println("Деление = " + div);

    }

    public static int getSum(int a, int b) {
        int sum = a + b;
        return sum;

    }
    public static int getSub(int a, int b) {
        int sub = a - b;
        return sub;
    }

    public static int getMult(int a, int b) {
        int mult =( a * b);
        return mult;
    }

    public static int getDiv(int a, int b) {
        int div = a / b;
        return div;
    }
}




        /* System.out.println(Math.addExact(var1, var2));
        System.out.println(Math.subtractExact(var1, var2));
        System.out.println(Math.multiplyExact(var1, var2));
        System.out.println(Math.divideExact(var1, var2));*/








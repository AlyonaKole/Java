package Homeworks.HW4;

public class Temperature {
    public static void main(String[] args) {

        //Представим, что у нас есть устройство, в котором две колбы.
        //Прибор работает корректно, если температура первой колбы выше 100 градусов, а температура второй колбы меньше 100 градусов.
        //Вы должны написать метод, который проверяет это устройство.
        //Ваша программа должна иметь переменные temperature1 и temperature2.
        //В результате метод возвращает true или false.

        int temperature1 = 100;
        int temperature2 = 200;
        getCheck(temperature1, temperature2);
    }
      private static void getCheck(int temperature1, int temperature2) {
        if (temperature1 > 100 && temperature2 < 100) {
            System.out.println("Прибор работает корректно");
        } else {
            System.out.println("Прибор работает некорректно");

        }
      }
}


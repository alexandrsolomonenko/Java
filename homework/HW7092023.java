package HomeWork;

public class HW7092023 {
    public static void main(String[] args) {

//        Представим, что у нас есть устройство, в котором две колбы.
//                Прибор работает корректно, если температура первой колбы выше 100 градусов, а температура второй колбы меньше 100 градусов.
//                Вы должны написать метод, который проверяет это устройство.
//                Ваша программа должна иметь переменные temperature1 и temperature2.
//                В результате метод возвращает true или false.

        int temperature1 = 110;
        int temperature2 = 90;

        boolean isDeviceWorking = checkDevice(temperature1, temperature2);
        System.out.println("Работает ли устройство корректно? " + isDeviceWorking);

//        У вас на банковском счету N долларов.
//                Вы хотите снять все, но банк разрешает снять только сумму, которая является делителем текущей суммы на счету и меньше текущей суммы.
//        Если вы снимаете максимально возможную сумму каждый день, сколько дней вам понадобится, чтобы забрать все свои деньги из банка?

        int N = 21;
        int days = daysToWithdraw(N);
        System.out.println("Дней для вывода всех средств: " + days);

    }
    public static boolean checkDevice(int temperature1, int temperature2) {
        if (temperature1 > 100 && temperature2 < 100) {
            return true;
        } else {
            return false;
        }
    }

        public static int daysToWithdraw(int N) {
            int days = 0;
            while (N > 0) {
                int maxWithdrawal = 1;
                for (int i = N / 2; i > 1; i--) {
                    if (N % i == 0) {
                        maxWithdrawal = i;
                        break;
                    }
                }
                N -= maxWithdrawal;
                days++;
            }
            return days;
        }

}

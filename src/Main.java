//import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        System.out.println("Task1");
        int[] arrMonth = {110000, 150000, 120000, 170000, 100000, 140000, 150000, 200000, 180000, 130000, 130000, 190000, 200000,
                110000, 100000, 140000, 170000, 120000, 100000, 180000, 160000, 190000, 200000, 130000, 120000, 150000, 100000, 200000, 170000, 120000};
        int sumMonth = 0;
        for (int dayMonth : arrMonth) {
            sumMonth = sumMonth + dayMonth;
            if (dayMonth == arrMonth[arrMonth.length - 1]) {
                //усл.оператор с пустым блоком кода!
            }
        }
        System.out.println("Сумма трат за месяц составила " + sumMonth + " рублей");
        System.out.println("Task2");
            //Если траты до 200000
            int maxMonth = 0, minMonth = 210000;
            for (int i = 0; i < arrMonth.length; i++) {
                if (arrMonth[i] < minMonth) {
                    minMonth = arrMonth[i];
                }
                if (arrMonth[i] > maxMonth) {
                    maxMonth = arrMonth[i];
                }
            }
            System.out.println("Минимальная сумма трат за день составила " + minMonth + " рублей. Максимальная сумма трат за день составила " + maxMonth + " рублей");

            System.out.println("Task3");

            var averMonth = 0;
            for (int i = 0; i < arrMonth.length; i++) {
                averMonth = sumMonth / arrMonth.length;
            }
            System.out.println("Средняя сумма трат за месяц составила " + averMonth + " рублей");

            System.out.println("Task4");

            char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

            for (int j = reverseFullName.length - 1; j >= 0; j--) {

                System.out.print(reverseFullName[j]);
            }

    }
}


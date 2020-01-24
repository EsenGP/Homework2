import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
                 // Сканер сразу для всех задач
          Scanner sc = new Scanner(System.in);

        //Задание 1 - оклад с подоходным налогом

        System.out.println("Введите оклад: ");
        int fm = sc.nextInt();
        System.out.println("Введите ставку подоходного налога в процентах: ");
        double procent = sc.nextDouble() / 100;
        double nalog = fm * procent;
        System.out.println("Оплачиваемый налог: " + nalog + "\nДеньги полученные на руки: " + (fm - nalog));

                    // Задание 2  -  обед в столовке
        int borch = 35;
        int katlet = 40;
        int kasha = 20;
        int tea = 3;
        int summ = borch + katlet + kasha + tea;
        int summ2 = borch + katlet*2 + kasha + tea;
        double vs = (double) summ2 / summ;
        System.out.print("Общая стоимость обеда :" + summ +
                "\nСоотношение стомости обеда до и после поднятия цен на котлеты ");
        System.out.println(String.format("%.2f", vs));

                        //Задание 3 -  граммы в тонны и килограммы
        System.out.println("Введите вес в граммах:");
        int gram = sc.nextInt();
        double kg = (double) gram / 1000;
        double ton = kg / 1000;
        System.out.println("Вес в килограммах: " + kg + "\nВес в тоннах: " + ton);

                           //Задание 4 - байты в киллобайты и мегабайты
        System.out.println("Введите объём в байтах: ");
        int b =  sc.nextInt();
        double kb = (double) b / 1024;
        double mb = kb / 1024;
        System.out.println("Объём в килобайтах: " + kb + "Объём в мегабайтах: " + mb);

    }
}

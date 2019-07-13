package by.kozik.app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static int countPackage;
    private static char[] array = new char[32];
    private static int length = array.length;   // 32

    public static void main(String[] args) {
        int counter = 1;

        while (true) {

            do {
                System.out.println("Расчёт №  " + counter);
                counter++;

                enterData();
            }
            while (counter<=10);
        }
    }

        static void enterData()
        {

            int maxCountPackage=100;
try{
            Scanner scanner = new Scanner(System.in);
            System.out.println(" ");
            System.out.print("Please enter Count potatos: ");
            int countPotatos = scanner.nextInt();

            if (!(countPotatos > 0 && countPotatos < 1000)) {
                System.out.print("Check enter Count potato!");
                System.out.println(" ");
            } else {

                System.out.print("Please enter Size of the Package: ");
                int sizePackage = scanner.nextInt();
                if (!(sizePackage > 0 && sizePackage < 1000)) {
                    System.out.println("Check enter Size of the Package!");
                } else {
                    countPackage = countPotatos / sizePackage;
                    if (countPackage > maxCountPackage) {
                        System.out.println("Не хватает мешков");
                    } else {
                        System.out.println("Count packages: " + countPackage);// вывод кол-во мешков
                        int Checkreminder = countPotatos % (sizePackage * countPackage);
                        System.out.println("Checkreminder potatos: " + Checkreminder);//вывод остаток картошки

                        System.out.println("Заказ упакован в мешки:");
                        WorkWhithArray();
                    }

                    System.out.println("_____________________ СВОБОДНАЯ КАССА! _______________________");
                }
            }
} catch (InputMismatchException ime){
            System.out.println("CHECK entered numbers!");
}
catch (ArithmeticException e){
    System.out.println("Check Devide by zero or Array initialization");
}
        }

    private static void WorkWhithArray() {
        for (int i = 0; i < length; i++) {//инициализация массива буквами
            array[i] = (char) ('А' + i);}

        for (int i = 1; i <= countPackage; i++) {//вывод номера мешка и его буквы
            if (i <= length) {
                System.out.println(i + " " + array[i - 1]);
            } else {
                System.out.println(i + " ФИАСКО - закончились буквы");
            }
        }
    }
}


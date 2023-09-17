package org.example;

import java.util.Scanner;

public class task1 {

    /*
    Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
    и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
    вместо этого, необходимо повторно запросить у пользователя ввод данных.
     */

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        enterDouble();
    }

    private static void enterDouble() {
        System.out.println("Введите дробное число: ");
        float number = scanner.nextFloat();
        try{
            System.out.printf("Вы ввели число %d\n" + number);
        }
        catch(NumberFormatException e){
            System.out.println("Введеное значение не соответсвует формату!\n");
        }
    }
}

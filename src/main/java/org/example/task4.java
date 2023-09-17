package org.example;

import java.util.Scanner;

public class task4 {

    /*
    Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
     */
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            String enterData = scanner.nextLine();
            if (enterData == null){
                throw new RuntimeException("Введено пустое значение! Попробуйте снова.");
            }
            System.out.printf("Введено значение: %d\n" + enterData);
        } catch (NullPointerException e) {
            e.getMessage();
        }
        finally {
            scanner.close();
        }
    }
}

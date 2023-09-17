package org.example;

public class task2 {

    /*
    Если необходимо, исправьте данный код
     */


    try {
        double[] intArray = {1, 3, 2, 7, 4, 2, 8, 3, 7};
        int d = 0;
        double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
    } catch (ArithmeticException e) {
        System.out.println("Catching exception: " + e.getMessage());
    }
}

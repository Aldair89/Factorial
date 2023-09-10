//Este código utiliza recursión para calcular el factorial de un número.
package com.mycompany.factorial;

public class Factorial {

    public static void main(String[] args) {
        int number = 5;
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    public static long calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("El número debe ser no negativo.");
        }

        if (number == 0 || number == 1) {
            return 1;
        }

        long factorial = number * calculateFactorial(number - 1);
        return factorial;
    }
}
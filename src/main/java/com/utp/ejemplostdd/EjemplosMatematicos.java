/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.ejemplostdd;

/**
 *
 * @author TOSHIBA
 */
public class EjemplosMatematicos {

public static void main(String[] args) {
        int numero = 7;
        System.out.println("El termino " + numero + " de la secuencia de Fibonacci es: " + fibonacci(numero)); // sin recursividad.
        System.out.println("El termino " + numero + " de la secuencia de Fibonacci es: " + fibonacciRecursivo(numero));// con recursividad.
        
        System.out.println("El factorial del numero " + numero + " es: " + factorial(numero)); // sin recursividad.
        System.out.println("El factorial del numero " + numero + " es: " + factorialRecursivo(numero));// con recursividad.
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int prev1 = 0;
        int prev2 = 1;
        int fib = 0;
        for (int i = 2; i <= n; i++) {
            fib = prev1 + prev2;
            prev1 = prev2;
            prev2 = fib;
        }
        return fib;
    }

    public static int fibonacciRecursivo(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int factorialRecursivo(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorialRecursivo(n - 1);
    }
    
}

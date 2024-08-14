package main;

import java.util.Scanner;
import fibonacci.FibonacciSequence;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FibonacciSequence fibonacciSequence = new FibonacciSequence();

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        fibonacciSequence.printFibonacci(n);

        sc.close();
    }
}

package gvcunhadev.desafiotarget.desafio2;

import java.util.Scanner;

public class FibonacciChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int num = scanner.nextInt();
        scanner.close();

        if (isFibonacci(num)) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean isFibonacci(int n) {
        int a = 0, b = 1;
        while (b <= n) {
            if (b == n) {
                return true;
            }
            int temp = a;
            a = b;
            b = temp + b;
        }
        return false;
    }
}

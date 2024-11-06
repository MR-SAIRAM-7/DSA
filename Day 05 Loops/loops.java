// Write a program that reads a set of integers ,and then prints the sum of the even and odd integers

import java.util.Scanner;

public class loops {
    // Write a program to find the factorialof any number entered by the user.

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Write a program to print the multiplication table of a number N, entered by the user.
    public static void multiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a Number ");
            int num = sc.nextInt();
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }
        System.out.println("Even Number sum is  : " + evenSum);
        System.out.println("Odd Number sum is : " + oddSum);
        sc.close();

        // Write a program to find the factorial of any number entered by the user.
        System.out.println("Factorial of number is : " + factorial(5));
        multiplicationTable(5);
    }
}

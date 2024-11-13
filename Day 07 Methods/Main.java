
import java.util.Scanner;

public class Main {

    // Functions in java!!
    // syntax
    // returntype name(datatype parameter 1 , datatype parameter 2 ......){
    //     code to be executed
    //     return statement
    // }
    public static void printHelloWorld() {
        System.out.println("Hello World!!");
        System.out.println("Hello World!!");
        System.out.println("Hello World!!");

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("The value of a is : " + a);
        System.out.println("The value of b is : " + b);
    }

    public static int product(int a, int b) {
        return a * b;
    }

    public static int factorial(int n) {
        int f = 1;
        if (n == 0) {
            return 1;
        } else {
            for (int i = 1; i <= n; i++) {
                f *= i;
            }
        }
        return f;
    }

    // calculating binomial co-efficients ncr = n!/r! x (n-r)!
    public static int binomialCoEfficient(int n, int r) {

        int nFatorial = factorial(n);
        int rFactorial = factorial(r);
        int n_rFactorial = factorial(n - r);

        return nFatorial / (rFactorial * n_rFactorial);
    }

    public static int multiply(int a, int... arr) { // var-args -- arguments are passed as an array i.e, arr
        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        return product;
    }

    // Check if number is a prime
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else if (n == 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    // Print primes in a range
    public static void printPrimes(int n) {

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + ",");
            }
        }
    }

    public static void binaryToDecimal(int binary) {
        int originalBinary = binary;
        int power = 0;
        int decimal = 0;
        while (binary > 0) {
            int lastDigit = binary % 10;
            decimal = decimal + (int) (lastDigit * Math.pow(2, power));
            power++;
            binary /= 10;
        }
        System.out.println("The binary : " + originalBinary + " In decimal is : " + decimal);
    }

    public static void decimalToBinary(int decimal) {
        int originalDecimal = decimal;
        String binary = "";
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary = remainder + binary;
            decimal /= 2;
        }
        // int binary1 =  Integer.parseInt(binary); -- coverting string to integer
        System.out.println("The binary form of decimal " + originalDecimal + " is " + binary);
    }

    public static void isPalindrome(int num) {
        int n = num;
        int revNum = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            revNum = revNum * 10 + lastDigit;  // Correctly reverse the number
            num /= 10;
        }

        if (revNum == n) {
            System.out.println(n + " is a palindrome");
        } else {
            System.out.println(n + " is not a palindrome");
        }
    }

    public static void main(String[] args) {

        printHelloWorld();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number1 : ");
        int num1 = sc.nextInt();

        System.out.print("Enter number2 : ");
        int num2 = sc.nextInt();

        System.out.println("The value of num1+num2 is " + add(num1, num2));
        swap(1, 2);

        System.out.println("Factorial : " + factorial(0));
        System.out.println("Factorial  : " + factorial(5));

        System.out.println("Binomial co-efficient is : " + binomialCoEfficient(10, 5));

        System.out.println("The multiplication value is : " + multiply(1, 2, 3, 4, 5, 6, 7, 8));

        System.out.println(isPrime(97));
        System.out.println(isPrime(5));
        System.out.println(isPrime(997));
        printPrimes(100);
        binaryToDecimal(1010011);
        decimalToBinary(83);
        isPalindrome(123);
        isPalindrome(121);
        isPalindrome(121549);

        sc.close();

    }
}

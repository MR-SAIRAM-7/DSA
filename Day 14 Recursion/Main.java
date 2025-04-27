public class Main {

    public static void printNumbers(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        printNumbers(n - 1);
        System.out.println(n);
    }

    public static void printNumsReverse(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNumsReverse(n - 1);
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int sumOfNaturalNums(int n) {
        int sum = 0;
        if (n == 0) {
            return sum;
        }
        sum += n + sumOfNaturalNums(n - 1);
        return sum;
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static boolean isSorted(int arr[], int startingPoint) {
        if (startingPoint == arr.length - 1) {
            return true;
        }
        if (arr[startingPoint] > arr[startingPoint + 1]) {
            return false;
        }
        return isSorted(arr, startingPoint + 1);
    }

    public static int firstOccurance(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurance(arr, key, i + 1);
    }

    public static int power(int x,int n){

        if(n == 0){
            return 1;
        }
        return x * power(x, n-1);
    }

    public static int optimizedPower(int x,int n){
        if(n == 0){
            return 1;
        }
        int halfPower = optimizedPower(x, n/2);
        int halfPowersq = halfPower * halfPower;
        // if n is odd
        if(n % 2 != 0){
            halfPowersq = x * halfPowersq;
        }
        return halfPowersq;
    }

    public static int tilingProblem(int n){
        if(n == 0 || n==1){
            return 1;
        }
        //vertical choice
        int fnm1 = tilingProblem(n-1);

        //horizontal choice
        int fnm2 = tilingProblem(n-2);

        // totalWays = vertical + horizontal
        int totalWays = fnm1 + fnm2;
        return totalWays;
    }
    public static void main(String[] args) {
        // Read notes for basic recursion concepts
        // printNumbers(5);
        // printNumsReverse(5);
        // System.out.println(factorial(5));
        // System.out.println(sumOfNaturalNums(3));
        // System.out.println(fibonacci(15));
        // int arr[] = { 1, 2, 37, 4, 5 };
        // System.out.println(isSorted(arr, 0));
        // System.out.println(firstOccurance(arr, 37, 0));
        // System.out.println(power(2,3));
        // System.out.println(optimizedPower(2, 3));
        // System.out.println(tilingProblem(5));

    }
}

public class Main {

    public static void updateArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 7;
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void printArrayMethod2(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + (end - start)) / 2;   // to overcome overflow condition of Intgeger max
            if (target == arr[mid]) {
                return mid;
            }
            if (target > arr[mid]) {
                start = mid + 1;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void reverseArray(int arr[]) {
        int first = 0;
        int end = arr.length - 1;
        while (first < end) {
            int temp = arr[first];
            arr[first] = arr[end];
            arr[end] = temp;
            first++;
            end--;
        }
    }

    public static void printPairs(int arr[]) {
        int totalPairs = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs : " + totalPairs);
    }

    public static void printSubArrays(int arr[]) {
        int totalSubArrays = 0;
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    sum += arr[k];
                }
                totalSubArrays++;
                System.out.println("----> sum is : " + sum);
                if (sum > maxSum) {
                    maxSum = sum;
                }
                if (sum < minSum) {
                    minSum = sum;
                }
            }
            System.out.println();
        }
        System.out.println("Total SubArrays : " + totalSubArrays);
        System.out.println("Maximum SubArray sum is : " + maxSum);
        System.out.println("Minimum SubArray sum is : " + minSum);
    }

    // Kadane's Algorithm
    public static int maxSubArraySum(int arr[]) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > maxSum) {
                maxSum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        // Arrays in java
        // syntax -- dataType arrayName[] = new dataType[size of the array]
        // int arr[] = new int[5]; -- declaring array and allocating memory
        // int marks[] = new int[10];
        // int nums[] = {1,2,3,4,5}; -- declaring and intializing 
        // int marks[index] = 10; initialing 

        // Arrays are mutable -- arrays are passed by reference to a function i.e, the actual values will be changed inside the main function if we change the values of array inside a function
    }
}

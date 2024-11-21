
public class Main {

    // Maximum Sub Array sum --- brute force method
    public static void maxSubArrSumMeth1(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int totalSubArrays = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    sum += arr[k];
                }
                System.out.println(" ---> The sum is " + sum);
                totalSubArrays++;
                if (sum > maxSum) {
                    maxSum = sum;
                }
                if (sum < minSum) {
                    minSum = sum;
                }
            }
            System.out.println();
        }
        System.out.println("Total Sub Arrays are : " + totalSubArrays);
        System.out.println("The Maximum Sub Array Sum is :  " + maxSum);
        System.out.println("The Minimum Sub Array Sum is :  " + minSum);
    }

    // Maximum Sub Array Sum - prefix sum method
    public static void prefixSum(int arr[]) {

        int maxSum = Integer.MIN_VALUE;
        // Calculate prefix array
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (i == 0) {
                    sum = prefix[j];
                } else {
                    sum = prefix[j] - prefix[i - 1]; // i = start j = end  indices of prefix [for which sub array sum is calculated]
                }
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        System.out.println("Maximum Subarray sum is : " + maxSum);
    }

    // MAximum SubArray Sum -- kadane's Algorithm
    public static void kadanesAlgorithm(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > maxSum) {
                maxSum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println("Maximum SubArray sum is : " + maxSum);
    }

    // leet code question --  42 (Arrays)
    public static int trappedRainWater(int arr[]) {
        int width = 1;
        // Calculate left max Boundary
        int leftMax[] = new int[arr.length];
        leftMax[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
        }

        // Calculate right max Boundary
        int rightMax[] = new int[arr.length];
        rightMax[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
        }

        // loop to calculate trapped water
        int trappedWater = 0;
        for (int i = 0; i < arr.length; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += (waterLevel - arr[i]) * width;
        }
        return trappedWater;
    }

    // leetcode question no.121 - arrays
    public static int buyAndSellStocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int nums[] = {2, 4, 6, 8, 10};
        // maxSubArrSumMeth1(nums);
        // prefixSum(nums);
        // kadanesAlgorithm(nums);
        // System.out.println(trappedRainWater(nums));
        System.out.println(buyAndSellStocks(nums));
    }
}

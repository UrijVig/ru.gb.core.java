package src.main.java.app;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] myArr = new int[5];
        getRandomArray(myArr);
        printArray(myArr);
        System.out.println(Arrays.toString(myArr) + " = " + checkBalance(myArr));

    }
    private static void getRandomArray(int[] arr){
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1,3);
        }
    }
    private static void printArray(int[] arr){
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

//    private static boolean checkBalance(int[] arr){
//        int leftSum = 0, rightSum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            leftSum += arr[i];
//            for (int j = i+1; j < arr.length; j++) {
//                rightSum +=arr[j];
//            }
//            if (leftSum == rightSum)
//                return true;
//            else rightSum = 0;
//        }
//        return false;
//    }
//    private static boolean checkBalance(int[] arr) {
//        int leftSum = 0, rightSum = 0;
//        for (int val : arr) {
//            rightSum += val;
//        }
//        if (rightSum % 2 != 0) return false;
//        for (int val : arr) {
//            leftSum += val;
//            rightSum -= val;
//            if (leftSum == rightSum) return true;
//        }
//        return false;
//    }
    private static boolean checkBalance(int[] arr) {
        int leftSum = 0;
        int rightSum = Arrays.stream(arr).sum();

        if (rightSum % 2 != 0) return false;
        for (int j : arr) {
            leftSum += j;
            rightSum -= j;
            if (leftSum == rightSum) return true;
        }
        return false;
    }

}

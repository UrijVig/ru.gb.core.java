package src.main.java.app;

public class Main {
    public static void main(String[] args) {
        int[] myArr = { 3, 4, 6, 2, 34, 5, 0, 5, 3, 3, 9 };
        System.out.println(findMaximalValue(myArr));
        System.out.println(findMinimalValue(myArr));
        System.out.println(findMaximalValueIndex(myArr));
        System.out.println(findMinimalValueIndex(myArr));

    }

    private static int findMinimalValue(int[] arr) {
        int minValue = arr[0];
        for (int j : arr) {
            if (j < minValue)
                minValue = j;
        }
        return minValue;
    }

    private static int findMaximalValue(int[] arr) {
        int maxValue = arr[0];
        for (int j : arr) {
            if (j > maxValue)
                maxValue = j;
        }
        return maxValue;
    }

    private static int findMinimalValueIndex(int[] arr) {
        int minValue = arr[0], minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static int findMaximalValueIndex(int[] arr) {
        int maxValue = arr[0], maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] myArr = new int[10];
        getRandomArray(myArr);
        printArray(myArr);
        System.out.println(getDifference(myArr));
    }
    private static int getDifference(int[] arr){
        return findMaximalValue(arr) - findMinimalValue(arr);
    }
    private static void getRandomArray(int[] arr){
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(15);
        }
    }

    private static void printArray(int[] arr){
        for (int element: arr) {
            System.out.print(element + " ");
        }
        System.out.println();
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
}

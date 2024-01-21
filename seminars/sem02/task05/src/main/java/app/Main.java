package src.main.java.app;

public class Main {
    public static void main(String[] args) {
        int[] myArr = {2, 7, 4, 6, 34, 2, 2, 8, 5, 7, 78};
        printArray(myArr);
        pigeon(myArr);
        printArray(myArr);
    }

    private static void pigeon(int[] arr) {
        final int min = findMinimalValue(arr), max = findMaximalValue(arr);
        int[] temp = new int[max - min + 1];
        for (int j : arr) temp[j - min]++;
        printArray(temp);
        System.out.println(temp.length);
        int count = 0;
        for (int i = 0; i < temp.length; i++)
            for (int item = temp[i]; item > 0; item--)
                arr[count++] = i + min;
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

    private static void printArray(int[] arr){
        for (int element: arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

}

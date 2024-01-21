import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] myArr = new int[20];
        getRandomArray(myArr);
        printArray(myArr);
        System.out.println(isDoubleZeros(myArr));
    }

    private static boolean isDoubleZeros(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0 && arr[i] == arr[i + 1]) return true;
        }
        return false;
    }

    private static void getRandomArray(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(5);
        }
    }

    private static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

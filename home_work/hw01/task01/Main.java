import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] myArr = new int[5];
        getRandomArray(myArr);
        printArray(myArr);
        System.out.println(countEvens(myArr));
    }

    private static int countEvens(int[] arr){
        int count = 0;
        for (int item : arr) {
            if (item % 2 == 0) count++;
        }
        return count;
    }

    private static void getRandomArray(int[] arr){
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(11);
        }
    }

    private static void printArray(int[] arr){
        for (int element: arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

}

package src.main.java.app;

public class Main {
    public static void main(String[] args) {
        int[][] myArr = new int[5][5];
        fillTheArray(myArr);
        printArray(myArr);
    }
    private static void fillTheArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - 1 - i] = 1;
        }
    }
    private static void printArray(int[] arr){
        for (int element: arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    private static void printArray(int[][] arr){
        for (int[] newArr : arr) {
            printArray(newArr);
        }
    }
}

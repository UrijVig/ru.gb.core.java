package src.main.java.app;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myArr = {3, 5, 67};
        myArr = add(myArr, 7);
        System.out.println(Arrays.toString(myArr));
        myArr = add(myArr, 235);
        System.out.println(Arrays.toString(myArr));
    }

    //    private static int[] add(int[] arr, int value){
    //        int[] newArr = new int[arr.length + 1];
    //        System.arraycopy(arr,0, newArr, 0, arr.length);
    //        arr = newArr;
    //        arr[newArr.length - 1] = value;
    //        return arr;
    //    }
    private static int[] add(int[] arr, int value) {
        int[] newArr = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        newArr[newArr.length - 1] = value;
        return newArr;
    }
}

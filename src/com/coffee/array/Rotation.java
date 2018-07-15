package com.coffee.array;

/**
 * Created by CRis Nguyen on 15/07/2018.
 * https://www.geeksforgeeks.org/array-rotation/
 */
public class Rotation {

    public static int[] rotate1(int[] arr, int n){

        for (int i = 0; i < n; i++) {
            rotateByOne(arr);
        }
        return arr;
    }

    private static void rotateByOne(int[] arr){
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
    }

    public static int[] rotate2(int[] arr, int n){
        reverseArr(arr, 0, n - 1);
        reverseArr(arr, n , arr.length - 1);
        reverseArr(arr, 0, arr.length - 1);
        return arr;
    }

    private static void reverseArr(int[] arr, int start, int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3 , 5, 6, 7};
        ArrayUtils.print(rotate2(arr, 2));
    }
}

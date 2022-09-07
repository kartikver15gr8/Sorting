package com.Sorting;

import java.util.Arrays;

public class BubbleSort {
    /* This is the one of the sorting algorithms, which is used to sort elements in the array
    either in ascending or descending order*/

    // It's also known as syncing sort or exchange sort
    public static void main(String[] args) {
        int[] arr = {78, 98, 54, 1, 98, 1, 4};
        int[] res = bubbleSort(arr);
        System.out.println(Arrays.toString(res));
//        BubbleSortByKunalsMethod(arr);
//        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        int count = 0;
        while (n > 1) {
            for (int i = 0; i < n-1; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr,i,i+1);
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("The array is already sorted!");
                break;
            }
            n--;
        }
        return arr;
    }

    // We can also implement the bubble sort algorithm like:
    // The below implementation is taught by "Kunal" in his DSA playlist

//    static void BubbleSortByKunalsMethod(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 1; j < arr.length - i; j++) {
//                if (arr[j] < arr[j - 1]) {
//                    //SWap
//                    int temp = arr[j];
//                    arr[j] = arr[j];
//                    arr[j-1] = temp;
//                }
//            }
//        }
//    }
}

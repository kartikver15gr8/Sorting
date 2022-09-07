package com.Sorting.CycleSort;

import java.util.Arrays;

public class cycleSortAlgo {
    public static void main(String[] args) {
        int[] arr = {5, 4, 8, 2, 1, 3, 6, 7, 10, 9};
        int[] ans = cycleSort(arr);
        System.out.println(Arrays.toString(ans));
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // If the Array is starting from 1 to n then use the below code
    static int[] cycleSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == i + 1) {
                i++;
            } else {
                swap(arr, i, arr[i] - 1);
            }
        }return arr;
    }
    // If the Array is starting from 0 to n then use the below code

//    static int[] cycleSort(int[] arr) {
//        int i = 0;
//        while (i < arr.length) {
//            if (arr[i] == i ) {
//                i++;
//            } else {
//                swap(arr, i, arr[i]);
//            }
//        }return arr;
//    }

    // The below solution is by kunal kushwaha

//    static int[] CycleSort(int[] arr) {
//        int i = 0;
//        while (i < arr.length) {
//            int correct = arr[i] - 1;
//            if (arr[i] != arr[correct]) {
//                swap(arr, i, correct);
//            } else {
//                i++;
//            }
//        }return arr;
//    }
}

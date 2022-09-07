package com.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int[] ans = selectionSort(arr);
        System.out.println(Arrays.toString(ans));
    }

    // The below function sorts the array using "Selection Sort" algorithm.
    static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - i - 1;
            int indexOfMax = getMaxIndex(arr, 0, lastIndex);    // Here we used the function "getMaxIndex" to get the index of max element in the array.
            swap(arr, lastIndex, indexOfMax);   // Here we used "swap" function to swap the max element with the element at lastIndex.
        }return arr;
    }

    // The below function will actually swap the elements
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // The below function get the index of max-element in the array
    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }return max;
    }
}

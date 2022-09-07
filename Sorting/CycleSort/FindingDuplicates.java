package com.Sorting.CycleSort;

import java.util.Arrays;

public class FindingDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 4, 3, 5};
        System.out.println(findDuplicate(arr));
    }
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        return arr[arr.length - 1];
    }
}

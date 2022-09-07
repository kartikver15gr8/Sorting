package com.Sorting.CycleSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 4};
        int[] ans = findDuplicate(arr);
        System.out.println(Arrays.toString(ans));
    }
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    static int[] findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        int[] result = new int[2];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                result[0] = arr[j];
                result[1] = j + 1;
            }
        }return result;


    }
}

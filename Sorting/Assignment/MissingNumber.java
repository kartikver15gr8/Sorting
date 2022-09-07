package com.Sorting.Assignment;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 0, 1};
        System.out.println(missingNumber(arr));
    }
    static void swap(int[] arr, int ind1, int ind2) {
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }

    static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        int ans = arr.length;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                ans = j;
            }
        }return ans;

    }
}

package com.Sorting.CycleSort;

import java.util.ArrayList;
import java.util.Arrays;

public class FindAllNumbersDisappearedInArray {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 1, 2, 3};
        System.out.println(findDissapearedNumbers(arr));

    }
    static ArrayList<Integer> findDissapearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                list.add(j + 1);
            }
        }return list;
    }
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

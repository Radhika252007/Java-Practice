package com.radhika.Lecture13;

import java.util.Arrays;

public class OuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 2, 1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    static void quickSort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }
        int start = low, end = high;
        int mid = start + (end - start) / 2;
        int pivot = nums[mid];
        while (start <= end) {
            // also a reason why if its already sorted it will not swap
            while (nums[start] < pivot) {
                start++;
            }
            while (nums[end] > pivot) {
                end--;
            }
            if (start <= end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }

        }
        quickSort(nums, low, end);
        quickSort(nums, start, high);

    }
}

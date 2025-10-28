package com.radhika.Lecture19;

import java.util.Arrays;

public class RotateArray {
    public void rotate(int[] nums, int k){
        int n = nums.length;
        int[] copy = nums.clone();
        for(int i=0;i<n;i++){
            nums[(i+k)%n] = copy[i];
        }
    }

    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
        int[] nums = {1,2,3,4,5,6,7};
        rotateArray.rotate(nums,3);
        System.out.println(Arrays.toString(nums));
    }
}

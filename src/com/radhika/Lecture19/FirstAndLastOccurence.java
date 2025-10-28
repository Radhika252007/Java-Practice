package com.radhika.Lecture19;

import java.util.Arrays;

public class FirstAndLastOccurence {
    public void findOccurence(int[] nums, int target){
        int[] result = new int[2];
        result[0] = firstOccurence(nums,target);
        result[1] = lastOccurence(nums,target);
        System.out.println(Arrays.toString(result));

    }
    private int firstOccurence(int[] nums, int target){
        int low = 0, high = nums.length-1,index = -1;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(nums[mid]>=target) high = mid -1;
            else if(nums[mid]<target) low =  mid +1;
            if(nums[mid]==target) index = mid;
        }
        return index;
    }
    private int lastOccurence(int[] nums, int target){
        int low = 0, high = nums.length-1,index = -1;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(nums[mid]<=target) low = mid +1;
            else if(nums[mid]>target) high =  mid -1;
            if(nums[mid]==target) index = mid;
        }
        return index;
    }

    public static void main(String[] args) {
        FirstAndLastOccurence firstLast = new FirstAndLastOccurence();
        int[] nums = {1,2,3,3,3,3,4,5,6,6,7};
        firstLast.findOccurence(nums,3);

    }
}

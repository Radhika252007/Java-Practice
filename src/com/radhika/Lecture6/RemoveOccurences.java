package com.radhika.Lecture6;

public class RemoveOccurences {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,3,2};
        int val = 2;
        int n = 6;
        int j = 0;
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val){
                count++;
                continue;
            }
            else {
                arr[j++] = arr[i];
            }
        }
        n -=  count;
        for(int i=0;i<n;i++){
            System.out.println(arr[i] + " ");
        }
    }
}

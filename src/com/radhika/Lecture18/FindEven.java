package com.radhika.Lecture18;

public class FindEven {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};
        int evenCount= 0;
        for(Integer num : arr){
            int value = num.intValue();
            if(value%2==0){
                evenCount++;
            }
        }
        System.out.println(evenCount);
    }
}

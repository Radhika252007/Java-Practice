package Practice.Arrays;

import java.util.Arrays;

public class MoveZerostoEnd {
    public static void main(String[] args) {
        int[] arr = new int[]{1,0,2,3,0,4,0};
        int i=0, j= 0;
        while(i<arr.length){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j] = temp;
                j++;
            }
           i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}

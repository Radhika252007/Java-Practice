package Practice.Arrays;

import java.util.Arrays;

public class rotateArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int temp = arr[4];
        for(int i=4;i>0;i--){
            arr[i]= arr[i-1];
        }
        arr[0]= temp;
        System.out.println(Arrays.toString(arr));
    }
}

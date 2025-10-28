package Practice.Arrays;

import java.util.Arrays;

public class insertElement {
    public static void main(String[] args){
        int[] arr = new int[7];
        for(int i=0;i<6;i++){
            arr[i] = i+1;
        }
        int pos = 2;
        int val = 34;
        for(int i=arr.length-1;i>pos;i--){
            arr[i] = arr[i-1];
        }
        arr[pos] = val;
        System.out.println(Arrays.toString(arr));

    }
}

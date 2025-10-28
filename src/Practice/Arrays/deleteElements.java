package Practice.Arrays;

import java.util.Arrays;

public class deleteElements {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int pos = 2;
        for(int i=pos;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        System.out.println(Arrays.toString(arr));
    }
}

package Practice.Arrays;

import java.util.Arrays;

public class printElements {
    public static void main(String[] args){
        int[] arr = new int[5];
        for(int i=0;i<5;i++){
            arr[i] = i+1;
        }
        System.out.println(Arrays.toString(arr));

    }
}

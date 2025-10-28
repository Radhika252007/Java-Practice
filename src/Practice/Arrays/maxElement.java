package Practice.Arrays;

public class maxElement {
    public static void main(String[] args){
        int[] arr = {4,23,12,89,0};
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}

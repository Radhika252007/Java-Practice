package Practice.Searching;

public class FirstOccurence {
    public static void main(String[] args) {
        System.out.println(firstOcc(new int[]{1,2,3,4,4,4,6,7,7,8,9}, 7));
    }
    static int firstOcc(int[] arr, int target){
        int start = 0, end = arr.length-1, index = -1;
        while(start<=end){
            int mid = start + ( end -start)/2;
            if(arr[mid]==target){
                index =  mid;
                end = mid - 1;
            }
            else if(arr[mid]>target){
                end  = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        return index;
    }
}

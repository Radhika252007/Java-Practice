package Practice.Searching;

public class CountOccurenecs {
    public static void main(String[] args) {
        System.out.println(countOcc(new int[]{1,2,3,4,4,4,6,7,7,8,9}, 7));
    }
    static int firstOcc(int[] arr, int target){
        int start = 0, end = arr.length-1, index = -1;
        while(start<=end){
            int mid = start +( end-start)/2;
            if(arr[mid]==target){
                index = mid;
                end = mid -1;
            }
            else if(arr[mid]>target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return index;
    }
    static int lastOcc(int[] arr, int target){
        int start = 0, end = arr.length-1, index = -1;
        while(start<=end){
            int mid = start +( end-start)/2;
            if(arr[mid]==target){
                index = mid;
                start = mid +1;
            }
            else if(arr[mid]>target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return index;
    }
    static int countOcc(int[] arr, int target) {
        if(firstOcc(arr,target)==-1){
            return 0;
        }
        return lastOcc(arr,target) - firstOcc(arr,target) + 1;
    }
}

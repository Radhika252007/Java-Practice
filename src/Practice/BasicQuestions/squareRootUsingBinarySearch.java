package Practice.BasicQuestions;

public class squareRootUsingBinarySearch {
    public static void main(String[] args) {
        int n= 20;
        int low = 1, high = n;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(mid*mid==n){
                System.out.println(mid);
                return;
            }
            else if(mid*mid<n){
                low = mid +1;
            }
            else{
                high = mid -1;
            }
        }
        System.out.println(high);
    }
}

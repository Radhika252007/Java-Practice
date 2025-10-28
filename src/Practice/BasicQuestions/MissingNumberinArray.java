package Practice.BasicQuestions;

public class MissingNumberinArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,6};
        int n = arr.length+1;
        int expected = n*(n+1)/2;
        int act = 0;
        for(int x : arr){
            act += x;
        }
        System.out.println(expected-act);
    }
}

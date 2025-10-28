package Practice.BasicQuestions;

public class findUniqueElement {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,2,1,1,3,3};
        int res = 0;
        for(int x : arr){
            res^=x;
        }
        System.out.println(res);
    }
}

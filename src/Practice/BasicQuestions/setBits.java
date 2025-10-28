package Practice.BasicQuestions;

public class setBits {
    public static void main(String[] args) {
        System.out.println(countBits(15));
    }
    static int countBits(int n){
        int count  =0;
        for(int i=0;i<32;i++){
            if(((n>>i)&1)==1){
                count++;
            }
        }
        return count;
    }
}

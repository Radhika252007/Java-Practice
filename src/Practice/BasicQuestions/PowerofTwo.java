package Practice.BasicQuestions;

public class PowerofTwo {
    public static void main(String[] args) {
        System.out.println(powerOfTwo(12));
    }
    static boolean powerOfTwo(int n){
        if(n<0){
            return false;
        }
        return ((n&(n-1))==0);
    }
}

package Practice.BasicQuestions;

public class BinomialCoefficient {
    public static void main(String[] args) {
        System.out.println(C(5,2));
    }
    static int C(int n, int k){
        if(k==0||k==n)  return 1;
        return C(n-1,k-1)+C(n-1,k);
    }
}

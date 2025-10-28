package Practice.Loops;

public class fibonacciSeries {
    public static void main(String[] args){
        int n= 10;
        int a =0, b=1;
        if(n==1){
            System.out.println(a);
        }
        else if(n == 2){
            System.out.println(a + " "+ b);
        }
        else{
            System.out.print(a + " " + b);
            for(int i=3;i<=n;i++){
                int next = a+ b;
                a = b;
                b = next;
                System.out.print(b + " ");
            }
        }
    }
}

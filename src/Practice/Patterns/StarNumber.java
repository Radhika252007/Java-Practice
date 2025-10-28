package Practice.Patterns;

public class StarNumber {
    public static void main(String[] args) {
        int n = 5;
        int k = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            for(int m=i+1;m<n;m++){
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }
}

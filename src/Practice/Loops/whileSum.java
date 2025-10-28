package Practice.Loops;

import java.util.Scanner;

public class whileSum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while(true){
            int n = in.nextInt();
            if(n==0){
                break;
            }
            sum += n;
        }
        System.out.println(sum);
    }
}

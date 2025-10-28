package Practice.Searching;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println("  *  *  ");
        System.out.println("*  *  *");
        System.out.println("*     *");
// Bottom triangle
        for (int i = 7; i >= 1; i -= 2) {
            for (int j = 0; j < (7 - i) / 2; j++) System.out.print(" ");
            for (int j = 0; j < i; j++) System.out.print("*");
            System.out.println();
        }

//        System.out.println();
//        System.out.println(findTarget(arr,0));
    }
    static boolean findTarget(int[][] arr, int target){
        int row = 0, col = arr[0].length-1;
        while(row< arr.length && col>=0){
            if(arr[row][col]==target) return  true;
            else if(arr[row][col]>target) col--;
            else row++;
        }
        return false;
    }
}

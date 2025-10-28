package Practice.Searching;

public class SaddlePoint {
    public static void main(String[] args) {
        int[][] matrix = {
                {3, 1, 7},
                {2, 8, 6},
                {4, 9, 5}
        };
        System.out.println(saddle(matrix));
    }
    static int saddle(int[][] arr){
        for(int i=0;i< arr.length;i++){
            int minIndex = arr[i][0];
            int colIndex = 0;
            for(int j=1;j<arr[i].length;j++){
                if(arr[i][j]<minIndex){
                    minIndex = arr[i][j];
                    colIndex = j;
                }
            }
            boolean saddle = true;
            for(int k=0;k<arr.length;k++){
                if(arr[k][colIndex] > minIndex){
                        saddle = false;
                        break;
                }
            }
            if(saddle){
                return minIndex;
            }
        }
        return -1;
    }
}

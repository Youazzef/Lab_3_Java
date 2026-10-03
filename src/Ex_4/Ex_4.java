package Ex_4;

public class Ex_4 {
    public static void main(String[] args){
        int[][] matrix = {
                {1,2,3,4,5,6,7,8},
                {9,10,11,12,13,14,15,16},
                {17,18,19,20,21,22,23,24},
                {25,26,27,28,29,30,31,32},
                {33,34,35,36,37,38,39,40},
                {41,42,43,44,45,46,47,48}
        };
        copyInto(matrix, 2,5 );
        printArr(matrix);
    }
    public static void copyInto(int[][] arr, int i, int j){
        for (int k = 0; k < arr.length ; k++){
            arr[k][j-1] = arr[k][i-1];
        }
    }
    public static void printArr(int[][] arr){
        for (int i = 0 ; i < arr.length;i++){
            for (int j = 0 ; j < arr[i].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

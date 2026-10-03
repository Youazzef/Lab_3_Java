package Ex_5;

public class Ex_5 {
    public static void main(String[] args){
        int[][] A = {
                {1,2,3,4,5,6,7,8},
                {9,10,11,12,13,14,15,16},
                {17,18,19,20,21,22,23,24},
                {25,26,27,28,29,30,31,32},
                {33,34,35,36,37,38,39,40},
                {41,42,43,44,45,46,47,48}
        };
        int[][] B = {
                {1,2,3,4,5,6,7,8},
                {9,10,11,12,13,14,15,16},
                {17,18,19,20,21,22,23,24},
                {25,26,27,28,29,30,31,32},
                {33,34,35,36,37,38,39,40},
                {41,42,43,44,45,46,47,48}
        };

        printArr(matrixAdd(A,B));
    }
    public static int[][] matrixAdd(int[][] A, int[][] B){
        int[][] C = new int[A.length][A[0].length];
        for (int i = 0; i < A.length;i++){
            for (int j = 0 ; j < A[0].length ; j++){
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
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


package Ex_3;

public class Ex_3 {
    public static void main(String[] args){
        int[][] arr = new int[5][];
        int count = 1;
        for (int i = 0 ; i < 5; i++){
            arr[i] = new int[i+1];
            for (int j = 0; j <= i; j++, count++){
                arr[i][j] = count;
            }
        }
        printArr(arr);
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

package Ex_2;

public class Ex_2 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        reverse(arr);
    }
    public static int[] reverse(int[] arr){
        printArray(arr, "Array");
        int[] Rarr = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >=0; i--,j++){
            Rarr[j] = arr[i];
        }
        System.out.println();
        printArray(Rarr, "Reversed array");
        return Rarr;
    }
    public static void printArray(int[] arr, String name){
        System.out.print(name + " : [");
        for (int i = 0; i < arr.length-1; i++){
            System.out.print( arr[i] + ", ");
        }
        System.out.print(arr[arr.length-1] + "]");
    }
}

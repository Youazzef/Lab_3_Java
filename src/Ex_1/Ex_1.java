package Ex_1;

public class Ex_1 {
    public static void main(String[] args){
        int[] arr = {106, 26, 81, 5, 15};
        System.out.println("Before sorting : ");
        printArray(arr);
        int[] Sarr = Ex_1.sortIntegers(arr);
        System.out.println("After sorting : ");
        printArray(Sarr);
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println("Element " + i + " contents " + arr[i]);
        }
    }
    public static int[] sortIntegers(int[] arr){
        int[] Sarr = new int[arr.length];
        for (int i = 0 ; i < arr.length; i++){
            Sarr[i] = arr[i];
        }
        int tmp;
        for (int i = 0 ; i < Sarr.length ; i++){
            for (int j = i ; j < Sarr.length; j++){
                if (Sarr[i] < Sarr[j]){
                    tmp = Sarr[j];
                    Sarr[j] = Sarr[i];
                    Sarr[i] = tmp;
                }
            }
        }
        return Sarr;
    }
}

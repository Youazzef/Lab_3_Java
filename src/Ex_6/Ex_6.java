package Ex_6;

public class Ex_6 {
    public static void main(String[] args){
        int[] arr = {5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17};
        System.out.println("Mediane is : " + median(arr));
        int[] arr2 = {42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27};
        System.out.println("Mediane is : " + median(arr2));
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
    public static int median(int[] arr){
        return sortIntegers(arr)[(arr.length)/2 ];
    }
}

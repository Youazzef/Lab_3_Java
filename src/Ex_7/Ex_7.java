package Ex_7;

public class Ex_7 {
    public static void main(String[] args){
        int[] arr = {1, -2, 4, -4, 9, -6, 16, -8, 25, -10};
        System.out.println("Standard deviation is : " + stdev(arr));
    }
    public static double stdev(int[] a){
        double average = 0.0;
        for (int i = 0 ; i < a.length ; i++){
            average+= a[i];
        }
        average/= (a.length-1);
        double s=0;
        for (int i = 0 ; i < a.length ; i++){
            s+= (a[i]-average)*(a[i]-average);
        }
        s/=a.length-1;
        return Math.sqrt(s);

    }
}

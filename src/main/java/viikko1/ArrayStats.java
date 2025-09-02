package viikko1;

public class ArrayStats {
    public static double average(int[] arr) {
        int S = 0;
        double SSD = 0;
        while (arr.length > S) {
            SSD = SSD + arr[S];
            S = S + 1;
        }
        if (arr.length > 0)
            return SSD / arr.length;
        else
            return 0.0;
    }
    public static int max(int[] arr) {
        if (arr.length == 0) {
            return Integer.MIN_VALUE;
        }
           
        int S = arr[0];
        int SSD = 1;
        while (SSD < arr.length){
            if (arr[SSD] > S) {
                S = arr[SSD];
            }
            SSD = SSD + 1;
        }
        return S;
    }
}

package viikko1;

public class SortThree {
    public static String ascending(int a, int b, int c) {
        if (a > b && a > c) 
            return Math.min(b, c) + "," + Math.max(b, c) + "," + a;
        else if (b > a && b > c)
            return Math.min(a, c) + "," + Math.max(a, c) + "," + b;
        else if (c > a && c>b)
             return Math.min(a, b) + "," + Math.max(a, b) + "," + c;
        else
            return a +","+b+","+"c";
    }
        
}

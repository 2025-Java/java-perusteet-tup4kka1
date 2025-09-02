package viikko1;

public class NumberProperties {
    public static String describe(int n) {
        if (n == 0) {
            return "nolla";
        }
        else if (n % 2 == 0) {
            if (n > 0) {
                return "positiivinen parillinen";
            }
            else {
                return "negatiivinen parillinen";
            }
        }
        else
            if (n < 0) {
                return "negatiivinen pariton";
            }
            else {
                return "positiivinen pariton";
            }      
    }
}

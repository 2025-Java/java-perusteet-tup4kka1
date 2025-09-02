package viikko1;

public class TimesTable {
    public static String table(int n) {
        int S = 0;
        String result = "";
        while (S < 10) {
            S = S + 1;
            result = result + n + " x " + S + " = " + (n * S) + "\n";
        }
        return result;
    }
}

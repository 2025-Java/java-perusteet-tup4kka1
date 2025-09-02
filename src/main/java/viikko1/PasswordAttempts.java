package viikko1;

public class PasswordAttempts {
    public static String login(String[] tries) {
        int ssd = 0;
        int I = 0;
        while (I < tries.length && I < 3) {
            if (tries[I] == "java123") {
                return "Tervetuloa!";
            }
            I = I + 1;
        }
        return "Liian monta virheellistä yritystä.";
    }
}

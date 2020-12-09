import javax.print.attribute.standard.RequestingUserName;

public class NumberUtils {
    int num;

    public boolean isPair() {
        return num % 2 == 0;
    }

    public boolean isOdd() {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPrime() {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public String printCount() {
        for (int i = 0; i <= num; i++) {
            String x = (String) i;
            return x;
        };
    }

}

package Know_Basic_Math;
import java.math.*;
// It can also be called as HCF = Highest common factor
// GCD = Greatest Common Divisors
public class Gcd {
    public static int findGcd(int n1, int n2) {
        int gcd = 1;
        for(int i=1; i<=Math.min(n1, n2); i++) {
            if((n1 % i == 0) && (n2 % i == 0)) {
                gcd = i;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        System.out.println("THe GCD / HCF is " +findGcd(20, 40));
    }
}

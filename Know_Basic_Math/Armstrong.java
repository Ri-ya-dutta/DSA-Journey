package Know_Basic_Math;

public class Armstrong {
    public static boolean isArmstrong(int n) {
        int original = n;
        int rev = 0;
        int lastDigit;
        while (n > 0) {
            lastDigit = n % 10;
            rev = (lastDigit * lastDigit * lastDigit) + rev;
            n /= 10;
        }
        return rev == original;
    } 
    public static void main(String[] args) {
        System.out.println(isArmstrong(370));
    }  
}

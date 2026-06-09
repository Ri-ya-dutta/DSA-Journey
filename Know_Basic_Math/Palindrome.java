package Know_Basic_Math;

public class Palindrome {
    public static boolean isPalindrome (int n) {
        int original = n;
        int lastDigit;
        int pal = 0;
        while (n > 0) {
            lastDigit = n % 10;
            pal = (pal * 10) + lastDigit;
            n /= 10;
        }
        return pal == original;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(1331));
    }
}

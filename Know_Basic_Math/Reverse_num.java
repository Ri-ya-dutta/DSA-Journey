package Know_Basic_Math;

public class Reverse_num {
    public static void reverseOfNum(int n) {
        int reverse = 0;
        int lastDigit;
        while (n > 0) {
            lastDigit = n % 10;
            n /= 10; 
            reverse = (reverse * 10) + lastDigit;
        }
        System.out.println("Reverse of the Number is " +reverse);
    }
    public static void main(String[] args) {
        reverseOfNum(123);
    }
}

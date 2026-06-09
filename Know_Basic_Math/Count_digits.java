package Know_Basic_Math;


public class Count_digits {
    public static void countDigits (int n) {
        int count = 0;
        while(n > 0) {
            n /= 10;
            count++;
        }
        System.out.println("Number of digits is " +count);
    }
    public static void main(String[] args) {
        countDigits(234);
    }
}

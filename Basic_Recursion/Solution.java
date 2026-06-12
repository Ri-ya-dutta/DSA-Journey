public class Solution {
    public static void printName(String name, int i, int n) {
        if (i > n) {
            return;
        
        }
        System.out.println(name);
        printName(name, i + 1, n);
    }
    public static void printNumbers1ton(int i, int n) {
        if (i > n) return;
        System.out.println(i);
        printNumbers1ton(i + 1, n);
    }

    public static void printNumbersnto1(int i) {
        if (i < 1) return;
        System.out.println(i);
        printNumbersnto1(i-1);
    }

    public static int sumOfNaturalNumbers (int N) {
        if ( N == 1) {
            return 1;
        }
        return N + sumOfNaturalNumbers(N - 1);
    }
    public static int factorial(int N) {
        if(N == 0) {
            return 1;
        }
        return N * factorial(N - 1);
    }
    public static int fibonacci(int N) {
        if( N <= 1) {
            return N;
        }
        int last = fibonacci(N - 1);
        int secondLast = fibonacci(N - 2);
        return last + secondLast;
    }
    public static void main(String[] args) {
        //printNumbers1ton(1, 5);
        //printNumbersnto1(5);
        Solution sol = new Solution();
        int n = 3;
        String name = "Hi Riya";
        //Solution.printName(name, 1, 3);
        //System.out.println(Solution.sumOfNaturalNumbers(5));
        //System.out.println(Solution.factorial(6));
          System.out.println(Solution.fibonacci(4));
    }
    
}



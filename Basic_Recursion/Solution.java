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

    public static void main(String[] args) {
        //printNumbers1ton(1, 5);
        //printNumbersnto1(5);
        Solution sol = new Solution();
        int n = 3;
        String name = "Hi Riya";
        Solution.printName(name, 1, 3);
    }
    
}



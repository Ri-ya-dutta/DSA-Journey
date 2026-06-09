package Know_Basic_Math;

import java.util.Arrays;

public class Divisors_num {
    // Brute force approach 
    public static int[] divisorsOfNum(int n) {
         // Step 1: count divisors first
        int length = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                length++;
            }
        }
        // Step 2: now create array with correct size
        int[] divisors = new int[length];
        // Step:3 fill array with actual divisors
        int index = 0;
        for(int i=1; i<=n; i++) {
            if(n % i == 0){
                divisors[index] = i;
                index++;
            }
        }
        // To print the elements in array
        // for(int i=0; i<divisors.length; i++) {
        //     System.out.print(divisors[i] +" ");
        // }
      return divisors;
    }
    public static void main(String[] args) {
        //divisorsOfNum(36);
        System.out.println(Arrays.toString(divisorsOfNum(36)));
    }
}

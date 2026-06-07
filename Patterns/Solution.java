class Solution {

    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(4);
        pattern4(5);
        pattern5(5);
        pattern6(5);
        pattern7(5);
        pattern8(5);
        pattern9(5);
        pattern10(5);
        pattern11(5);
        pattern12(5);
        pattern13(5);
        pattern14(5);
        pattern15(5);
    }

    public static void pattern1(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n){
        int count = 1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++){
                System.out.print(count +" ");
            }
            System.out.println();
            count++;
        }  
    }

    public static void pattern5(int n) {
        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern6(int n) {
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void pattern7(int n) {
        for(int i=1; i<=n; i++) {
            // print spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            // print star
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern8(int n) {
        System.out.println("Inverted pyramid");
        for(int i=1; i<=n; i++) {
             // print spaces
            for(int j=1; j<i; j++) {
                System.out.print(" ");
            }

            // print stars
            for(int j=n; j>=i; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    public static void pattern9(int n) {
        System.out.println("Diamond");
        // upper-half 
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // lower-half
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    } 
    public static void pattern10 (int n) {
        System.out.println("Hal-butterfly");
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n-1; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern11 (int n) {
        System.out.println("0-1 triangle");
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if((i + j) % 2 == 0){
                    System.out.print(1 +" ");
                } else {
                    System.out.print(0 +" ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern12 (int n) {
        for(int i=1; i<=n; i++) {
            // digits
            for(int j=1;j<=i; j++) {
                System.out.print(j+" ");
            }

            // spaces
            for(int j=1; j<= 2 * (n-i); j++) {
                System.out.print("  ");
            }
            // digits
            for(int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void pattern13 (int n) {
        int count = 1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(count +" ");
                count++;
            }
            System.out.println();
        }
    }

    public static void pattern14 (int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print((char) ('A' + j) +" ");
            }
            System.out.println();
        }
    }

    public static void pattern15 (int n) {
        for(int i=n; i>=0; i--) {
            for(int j=0; j<i; j++) {
                System.out.print((char)('A' + j) +" ");
            }
            System.out.println();
        }
    }
}
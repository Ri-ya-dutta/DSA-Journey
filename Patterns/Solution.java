class Solution {

    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(4);
        pattern4(5);
        pattern5(5);
        pattern6(5);
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
}
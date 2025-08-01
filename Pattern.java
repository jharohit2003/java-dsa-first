public class Pattern {
    // code for win
    static void pattern1(int n){
        for(int i =0 ; i<n ;i++){
            for(int j =0;j<i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int i =0 ; i<n ;i++){
            for(int j =0;j<n-i;j++){
                System.out.print('*');
            }
            
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int i =1 ; i<=n ;i++){
             System.out.print(" ".repeat(n-i));
            // for(int j =1;j<n-i;j++){
            //     System.out.print(' ');
            // }

            System.out.print("*".repeat(i));
            // for(int j =1;j<=i;j++){
            //     System.out.print('*');
            // }
            
            System.out.println();
        }
    }
     static void pattern4(int n){
        for(int i =0 ; i<n ;i++){
            for(int j =0;j<n;j++){
                System.out.print('*');
            }
            
            System.out.println();
        }
    }
    static void pattern5(int n){
        for(int i =1 ; i<=n ;i++){
            for(int j =1;j<=n;j++){
                if(i==1  || i==n || j==1 || j==n){
                    System.out.print('*');
                }else{
                    System.out.print(" ");
                }
                
            }
            
            System.out.println();
        }
    }
        static void pattern6(int n){
        for(int i =1 ; i<=n ;i++){
            for(int j =1;j<=n-i+1;j++){
                System.out.print(" ");
                
            }
            for(int j =1;j<=i;j++){
                System.out.print("* ");
                
            }
            
            System.out.println();
        }
    }
    static void pattern7(int n){
        for(int i =1 ; i<=n ;i++){
            for(int j =1;j<=n-i+1;j++){
                System.out.print(" ");
                
            }
            for(int j =1;j<=i;j++){
                System.out.print("*");
                
            }
            for(int j =2;j<=i;j++){
                System.out.print("*");
                
            }
            
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("\npattern 1 \n");
       pattern1(5); 
         System.out.println("\npattern 2 \n");
       pattern2(5);
       System.out.println("\npattern 3 \n");
       pattern3(5);
       System.out.println("\npattern 3 \n");
       pattern4(5);
       System.out.println("\npattern 5 \n");
       pattern5(5);
       System.out.println("\npattern 6 \n");
       pattern6(5);
       System.out.println("\npattern 7 \n");
       pattern7(5);
    }
}

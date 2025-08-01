import java.util.Scanner;

public class Rotate {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the number:");
     int n = sc.nextInt();
    System.out.println("enter the kth value:");
     int k  = sc.nextInt();
        // output = 72456
        // last digit dega '%'
        // last digit ko hata dega '/'
        int t= n;
        int div =(int)Math.pow(10,k);
        t = n%div;
        
        n = n/div;
       
        int a =n;
        div =1;
        while(a!=0){
            div=div*10;
            
            a=a/10;
        }
        

        int ans = t*(div)+n;
        System.out.println(ans);
        

    }
}

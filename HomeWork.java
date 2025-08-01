import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();
        int l=n%10;
        int t =n;
        int div =1;
        while(t>0){
             div = div*10;
             t=t/10;
        }
        div=div/10;
        
        int f = n/div;
        n = n%div;
        int ans = l*div + n;
        ans = ans/10;
        ans = ans*10+f;
        System.out.println(ans +" updated form");
    
       


    }
}

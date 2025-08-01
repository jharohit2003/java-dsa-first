import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value : ");
        int n = sc.nextInt();
        int t=n;
        int ans =0;
        int i =1;
        while(t>0){
            int d = t%10;
            ans += i*( (int)Math.pow(10, d-1));
            t=t/10;
               i++;
        }
        System.out.println(ans);
    }
}

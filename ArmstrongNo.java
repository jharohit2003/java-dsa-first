import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        // armstrong number
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();
        int cnt =0;
        int t = n;
        while(t>0){
            cnt++;
            t=t/10;
        }
    
        int sum =0;
        t=n;
        while(t>0){
         int d = t%10;
         sum += (int)Math.pow(d,cnt);
           t=t/10;
        }
        
        if(sum==n){
            System.out.println("number is Armstrong Number");
        }else{
            System.out.println("number is not Armstrong Number");
        }
    }
}
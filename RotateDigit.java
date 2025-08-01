import java.util.Scanner;

public class RotateDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.print("Enter the kth number : ");
        int k = sc.nextInt();
        int cnt =0;
        int t =n;
        while(t>0){
            cnt++;
            t=t/10;
        }
        
        k = k % cnt;
        if(k<0){
            k= cnt+k;
        }
        cnt--;
        int sum =0;
        for(int i =0 ;i<k;i++){
            int d = n%10;
            n=n/10;
            n =  (d*(int ) Math.pow(10,cnt)) + n;

        }
        System.out.println(n);

    }
}

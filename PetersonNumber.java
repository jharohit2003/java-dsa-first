import java.util.Scanner;

public class PetersonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();
        int t=n;
        int sum =0;
        while(t>0){
            int d = t%10;
            sum += fact(d);
            t=t/10;

        }
        if(n==sum){
            System.out.println("peterson number");
        }else{
            System.out.println("not a peterson number");
        }
        
    }
    public static int fact(int n ){
        if(n<=1){
            return 1;
        }
        return n*fact(n-1);
    }
}

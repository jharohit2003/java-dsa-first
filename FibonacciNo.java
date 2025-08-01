import java.util.Scanner;

public class FibonacciNo {
    public static void main(String[] args) {
        int f=0;
        int s =1;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number upto which you want to print fibonacci no: ");
        int n = sc.nextInt();
        int t=0;

        // for(int i =2 ;i<n ;i++){
        //     int next = f+s;
        //     System.out.print(f+" ");
        //     f=s;
        //     s=next;

        // }
        while(t<n){
           int next = f+s;
           System.out.print(f+" ");
           f=s;
             s=next;
             t++;
        }
    }
}

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        boolean flag = true;
        for(int i =2 ;i*i<n ;i++){
            if(n%i==0){
                flag = false;
            }
        }
        if(flag){
            System.out.println("number is prime");
        }else{
            System.out.println("number is not prime");
        }
    }
}

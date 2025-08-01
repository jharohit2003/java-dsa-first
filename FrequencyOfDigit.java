import java.util.Scanner;
//paranav mistri
public class FrequencyOfDigit {
    // find the frequency of each digit (using array)
    public static void main(String[] args) {
        int [] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();
        int t= n;
        while(t>0){
            int d = t%10;
            arr[d] ++;
            t=t/10;
        }
       int i =0;
        for(int a : arr){
            if(a>0){
                System.out.println(i +"->"+ a);
            }
            i++;
        }
    }
}

public class LCM {
    public static void main(String[] args) {
        int n =100;
        int n1=0;
        int n2= 1;
        int big = n1>=n2?n1:n2;
        while(true){
            if(big%n1==0 && big%n2==0){
                System.out.println(big);
                break;
            }
            big++;
        }
        

        
    }
}

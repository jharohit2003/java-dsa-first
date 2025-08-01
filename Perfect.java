public class Perfect {
    public static void main(String[] args) {
        int n1=28;
        int sum=0;
        for(int i =1;i<=(n1/2);i++){
            
            if(n1%i==0){
              sum += i;
            }
        }
        if(sum==n1){
            System.out.println("number is perfect");
        }else{
            System.out.println("not perfect number");
        }
    }
}

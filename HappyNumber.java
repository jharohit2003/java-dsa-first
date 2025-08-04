import java.util.HashMap;

public class HappyNumber {
    public static void main(String[] args) {
      int n = 1211;
      
       HashMap<Integer , Integer> mpp = new HashMap<>();
       while(true){
       
        int t = n;
        int sum =0;
        
        while(t>0){
            int d = t%10;
            sum += Math.pow(d,2);
            t=t/10;
        }
         mpp.put(sum , mpp.getOrDefault(sum , 0)+1);
         if(mpp.get(sum)>1 ){
            System.out.println(false);
            break;
        }
        if(sum==1){
         System.out.println(true);
         break ;
        }
        n = sum;
       

       
    

}
    }
}

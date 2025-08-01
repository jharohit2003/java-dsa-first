public class Loop {
    public static void main(String[] args) {
        int  n = 12345;
        int a =n;
        int t=1;
        while(a!=0){
         t = t*10;
         a=a/10;
        }
        t=t/10;
        while(n>0){
            int d = n/t;
            System.out.println(d);
            n=n%t;
            t=t/10;

        }
    
        // int t1=n;
        // int rev=0;
        // while(t1>0){
        //     int d1 = t1%10;
        //         rev =rev*10+d1;
            
        //     t1=t1/10;
        // }
        // int t=rev;
        
        // while(t>0){
        //     int d = t%10;
        //     System.out.println(d);
        //     t=t/10;
        // }
    }
}

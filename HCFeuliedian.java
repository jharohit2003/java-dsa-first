public class HCFeuliedian {
    public static void main(String[] args) {
        int a =121;
        int b = 123321;
        if(a<b){
         int t= a;
         a =b;
         b=t;
        }
        int r = a%b;
        while(r>0){
            a=b;
            b=r;
            r = a%b;
        }
        System.out.println(b);
        while(a!=b){
            if(a>b){
                a= a-b;
            }else{
                b=b-a;
            }
        }
        System.out.println(a);
    }
}

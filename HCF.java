public class HCF {
    public static void main(String[] args) {
        int n1 = 121;
        int n2=1221;
        int s = n1<n2?n1:n2;
        int gcd= 1;
        for(int i =1;i<s;i++){
            if(n1%i==0 && n2%i==0){
                gcd=i;
            }
        }
        System.out.println(gcd);
    }
}

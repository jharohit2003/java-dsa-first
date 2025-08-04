public class AutomorphicNumber {
// A number is called Automorphic number if and only if its square 
//ends in  has the same last digit as the number itself.

    public static void main(String[] args) {
        int n = 56;
        int last = n%10;
        long sq = n*n;
        if(sq%10 == last){
            System.out.println("Automorphic");
        }else{
            System.out.println("Not Automorphic");
        }
    }
}

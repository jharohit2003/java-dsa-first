public class Vowels {
    public static void main(String[] args) {
        int cnt =0;
        String a ="hello How are you";
        int [] arr = new int[33];
        for(int i =0 ;i<a.length();i++){
            if(a.charAt(i)=='a'||
            a.charAt(i)=='e' ||
            a.charAt(i)=='i' ||
            a.charAt(i)=='o' ||
            a.charAt(i)=='u'  ){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}

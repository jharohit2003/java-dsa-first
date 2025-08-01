import java.math.BigInteger;
import java.text.DateFormat;
import java.util.Date;

public class StringDemo {
    public static void main(String[] args) {
        BigInteger b = new  BigInteger("1000000000000000000");
        StringBuffer sb = new StringBuffer("rohit"); // Syncronise
        System.out.println(sb);

        Date date = new Date();
        System.out.println(date);
        DateFormat df = DateFormat.getDateInstance();
        System.out.println(df.format(date));


        System.out.println(sb.capacity()); // length > capacity   (oldcap  * 2 + 2)
        System.out.println(sb.length());
        StringBuilder s = new StringBuilder();
        System.out.println(s.capacity());
        System.out.println(s.length());
        StringDemo d = new StringDemo();
        StringDemo C = new StringDemo();
        C.equals(d);
        d.equals(d);
        String a ="Rohit".intern(); // String Pool banata hai (literals)
        String b ="Rohit";
        String c = new String("RohiT").intern();
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(a.equals(c));
        b="rohit jha"; // String immutable
        System.out.println(a==b);
        System.out.println(a.equalsIgnoreCase(c));
        System.out.println(a.compareTo(c));   // positive negative 0

    }
}

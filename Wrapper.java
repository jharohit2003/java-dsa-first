public class Wrapper {
    public static void main(String[] args) {
        // medium professional bloging
         int x = 10;
         byte y = (byte) x;
         int z=y;
         Integer h = 1000; // wrappper integer (refernce type/immutable)
         byte g = h.byteValue();
         String g1 = "1000";
         int b2 = Integer.parseInt(g1); // important
         System.out.println(Integer.toHexString(45));
         System.out.println(Integer.toOctalString(55));
         System.out.println(Integer.toBinaryString(22));

    }
}

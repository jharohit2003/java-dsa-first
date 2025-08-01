import java.util.Scanner;
import java.io.File;

public class ScannerDemo {
    public static void main(String[] args)throws Exception {
        //BufferReader 
        //console class
        Scanner sc = new Scanner(new File("C:\\Users\\rohit\\OneDrive\\Desktop\\DSA\\ScannerDemo.java"));
    
        int word =0;
        while(sc.hasNext()){
            word++;
            System.out.println(sc.next());
        }
        System.out.println(word);
    }
}

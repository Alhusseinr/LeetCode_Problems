package decimaltofpn;
import java.util.*;
public class DecimaltoFPN {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a decimal: ");
        int decimal = scan.nextInt();
        System.out.println(Float.intBitsToFloat(decimal));
    }
    
}

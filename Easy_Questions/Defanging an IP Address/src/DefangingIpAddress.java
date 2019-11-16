import java.util.*;

public class DefangingIpAddress {
    public static void main(String args[]){
        String Ip = "255.100.50.0";
        System.out.println(DefangIP(Ip));
    }

    public static String DefangIP(String Ip){
        String[] strArry = Ip.split("\\.");
        String str = "";
        for(int i = 0; i < strArry.length; i++){
            str += strArry[i] + "[.]";
        }

        return str.substring(0, str.length() -3);
    }
}

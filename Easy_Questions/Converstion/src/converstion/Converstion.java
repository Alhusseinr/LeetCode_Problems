/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converstion;
import java.util.*;
public class Converstion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float decimal;
        System.out.print("Enter the 32-FPN without any spaces: ");
        decimal = Float.intBitsToFloat(Integer.parseInt(scan.nextLine(), 2));
        System.out.println("Decimal Value is: " + decimal);
    }
    
}

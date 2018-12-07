package converttonums;

import java.util.*;

public class ConvertToNums {

    public static void convertToTitle(String s) {
        int counter = 0, sum = 0, k = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            k = (int) s.charAt(i) - '0' - 16;
            sum += (int) (k * (Math.pow(26, counter)));
            counter++;
        }
        System.out.println("The numerical value of: " + s + " is " + sum);
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a combination of letters without any spaces: ");
        String input = scn.next();
        convertToTitle(input);
    }

}

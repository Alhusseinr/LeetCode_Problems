package binarytohex;

import java.math.BigInteger;

import java.util.*;

public class BinaryToHex {

    public static String binaryToHex(String binary) {
        return new BigInteger(binary, 2).toString(16);

    }

    public static String hexToBin(String hexa) {
        return new BigInteger(hexa, 16).toString(2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int decimal = sc.nextInt();

        String binary = Integer.toString(decimal, 2);
        System.out.println("Binary of the entered number: " + binary);

        String hexa = binaryToHex(binary);
        System.out.println("Hex: " + hexa);

        String binaryAgain = hexToBin(hexa);
        System.out.println("Binary: " + binaryAgain);
    }

}

import java.util.*;

public class subtractProductAndSum {
    public static void main (String[] args){
        int n = 234;
        System.out.println(subtractProductAndSum(n));
    }

    public static int subtractProductAndSum(int n) {
        int diff = Prod(n) - Sum(n);
        return diff;
    }

    public static int Sum(int n){
        int sum = 0;

        if (n == 0){
            return 0;
        }

        while(n != 0){
            sum = sum + n%10;
            n = n/10;
        }
        return sum;
    }

    public static int Prod(int n){
        int prod = 1;

        if(n == 0){
            return 0;
        }

        while (n != 0){
            prod = prod * (n % 10);
            n = n/10;
        }

        return prod;
    }

}

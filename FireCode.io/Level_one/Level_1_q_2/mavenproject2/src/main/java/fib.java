/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rami Alhussein
 */
public class fib {
    public static void main(String args[]){
        int n = 9;
        getFib(n);
    }
    
    public static int getFib(int n){
        int f[] = new int[n+2]; // Declearing the an array to store the fib sequence
        int i;
        
        //setting the first and second index
        f[0] = 0; 
        f[1] = 1;
        
        // checking for each index in the array
        for(i = 2; i <= n; i++){
            f[i] = f[i - 1] + f[i - 2];
        }
        
        return f[n];
    }
}

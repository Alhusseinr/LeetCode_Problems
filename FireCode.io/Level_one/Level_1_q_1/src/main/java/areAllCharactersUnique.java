/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rami Alhussein
 */
public class areAllCharactersUnique {
    public static void main(String args[]){
        String strInput = "aaaa";
        allChar(strInput);
    }
    
    public static boolean allChar(String str){
        if(str == null){
            return true;
        }
        
        for(int i = 0; i < str.length(); i++){
            for(int j = i + 1; j < str.length(); i++){
                if(str.charAt(i)== str.charAt(j))
                    return false;
            }
        }
        return true;
    }
}

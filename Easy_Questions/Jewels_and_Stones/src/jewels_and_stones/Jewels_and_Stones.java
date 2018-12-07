package jewels_and_stones;
import java.util.*;
public class Jewels_and_Stones {

    public static void numJewelsInStones(String J, String S){
        HashSet<Character> jewels = new HashSet<Character>();
        int result = 0;
        
        for(int i = 0; i < J.length(); i++){
            jewels.add(J.charAt(i));
        }
        
        for(int j = 0; j < S.length(); j++){
            if(jewels.contains(S.charAt(j))){
                result++;
            }
        }
        System.out.println(result);
    }
    
    public static void main(String[] args) {
        String J = "aA";
        String S = "aAAbbbb";
        numJewelsInStones(J, S);
        
    }
}

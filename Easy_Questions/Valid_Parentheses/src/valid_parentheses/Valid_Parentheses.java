package valid_parentheses;
import java.util.*;

public class Valid_Parentheses {

    public static void main(String[] args) {
        String parentheses = "({[]})";
        CheckParentheses(parentheses);
    }
    
    public static boolean CheckParentheses (String parentheses){
        for(int i = 0; i < parentheses.length(); i++){
            if(parentheses.indexOf(i) == parentheses.indexOf(i) + 1){
                return true;
            }
        }
        return false;
    }
    
}

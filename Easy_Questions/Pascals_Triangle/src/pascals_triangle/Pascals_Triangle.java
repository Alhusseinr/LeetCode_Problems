package pascals_triangle;
import java.util.*;

public class Pascals_Triangle {
    public static void main(String[] args) {
        int numRows = 5;
        int rowIndex = 3;
        generate(numRows, rowIndex);
        
    }  
    public static void generate(int numRows, int rowIndex){
        List<List<Integer>> allRows = new ArrayList();
        ArrayList<Integer> row = new ArrayList();
        
        for(int i = 0; i < numRows; i++){
            row.add(0,1);
            for(int j = 1; j < row.size()-1; j++){
                row.set(j, row.get(i) + row.get(j + 1));
            }
            allRows.add(new ArrayList<Integer>(row));
        }
        System.out.println(allRows);
    }
}

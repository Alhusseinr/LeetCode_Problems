package pascals_triangle;
import java.util.*;

public class Pascals_Triangle {
    public static void main(String[] args) {
        int numRows = 5;
        int rowIndex = 3;
        generate(numRows, rowIndex);
        
    }  
    public static void generate(int numRows, int rowIndex){
        
        List<List<Integer>> allRows = new ArrayList(); // initialize allRows as a list of lists of integer
        ArrayList<Integer> row = new ArrayList(); // initialize row as an Array List
        
        for(int i = 0; i < numRows; i++){ // for loop to go through all of numRows 
            row.add(0,1); // At the start of every row add 1 at index 0 
            for(int j = 1; j < row.size()-1; j++){ // for loop to go through the size of the row - 1 
                row.set(j, row.get(j) + row.get(j + 1)); // we are adding the values to the row
            }
            allRows.add(new ArrayList<Integer>(row)); // we are adding the row into the all row array
        }
        System.out.println(allRows); // prints out all rows
    }
}

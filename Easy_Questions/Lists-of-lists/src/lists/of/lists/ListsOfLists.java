package lists.of.lists;

import java.util.*;

public class ListsOfLists {

    public static List<List<Integer>> List(int numRows) {
        List<List<Integer>> allrows = new ArrayList(); //creates a list of lists
        ArrayList<Integer> row = new ArrayList(); // creates the rows that we will be adding into our list allrows

        for (int i = 0; i < numRows; i++) {
            row.add(0, 1); // it will add 1 into index 0 in the row list
            for (int j = 1; j < row.size() - 1; j++) {
                row.set(j, row.get(j) + row.get(j + 1)); // does the addition of the triangle
            }
            allrows.add(new ArrayList<Integer>(row)); // addes the rows list into our main list of lists
        }
        System.out.println(allrows); //prints out pascals triangle
        return allrows;
    }

    public static void main(String[] args) {
        int num = 6;
        List(num);
    }

}

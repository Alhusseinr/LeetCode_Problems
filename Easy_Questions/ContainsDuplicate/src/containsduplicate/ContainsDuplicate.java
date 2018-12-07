package containsduplicate;

public class ContainsDuplicate {
    
    public static void isdouble(int[] IntArray) {
        for (int i = 0; i < IntArray.length; i++) {
            for (int j = 0; j < i; j++) {
                if (IntArray[j] == IntArray[i]) {
                    System.out.println("There are doublicates in the array");
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        isdouble(arr);
    }
    
}

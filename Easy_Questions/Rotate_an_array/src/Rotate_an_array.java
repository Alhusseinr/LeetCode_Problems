public class Rotate_an_array {
    public static void main(String[] args) {
        int[] arr  = new int[]{0,1,2,3,4,5,6,7,8,9};
        int k = 5;
        int statingIndex = arr.length - k;
        rotateArr(arr, statingIndex);
    }
    
    public static void rotateArr (int[] arr, int index){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != arr[index]){
                arr[i] = arr[index];
            }
            System.out.println(arr[i]);
        }
    }
}

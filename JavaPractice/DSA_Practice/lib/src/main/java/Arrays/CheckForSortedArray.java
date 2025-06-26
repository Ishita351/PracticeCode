package Arrays;

public class CheckForSortedArray {
    public static boolean isSorted(int[] arr){
        for ( int i = 1 ; i < arr.length ;i++){
            if(arr[i] > arr[i-1]){
                return true;
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[] arr = {1,2,7,56,34};
        boolean ans = isSorted(arr);
        System.out.println(ans);
    }
}

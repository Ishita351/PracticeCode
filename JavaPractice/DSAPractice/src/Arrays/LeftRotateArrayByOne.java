package Arrays;

public class LeftRotateArrayByOne {
    public static int[] rotateArr(int[] arr){
        int temp = arr[0];
        for ( int i =1; i< arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        return arr;
    }
    public static void main(String[] args){
        int[] arr = {1,2,7,56,34};
        int[] ans = rotateArr(arr);
        System.out.println(ans);
    }
}

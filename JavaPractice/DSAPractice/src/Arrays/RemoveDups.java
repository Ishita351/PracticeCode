package Arrays;

import java.util.HashSet;

// to remove duplicates of sorted array
public class RemoveDups {
    public static int[] removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int index = 0;
        for (int it : set) {
            arr[index] = it;
            index++;
        }
        return arr;
    }
    public static int[] removeDupsOptimal(int[] arr){
        int i = 0 ;
        for(int j =1 ; j<arr.length ;j++){
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = {1,2,7,7,34,34,78,87};
        int[] ans = removeDuplicates(arr);
        int[] ansOp = removeDupsOptimal(arr);
        System.out.println(ans);
        System.out.println(ansOp);
    }
}

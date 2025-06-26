package tech.blueglacier.arrays;

public class LargestElement {
    public static void printLargest(int[] arr){
        int largest = arr[0];
        for(int i =0 ; i < arr.length ; i++){
            if (arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
    public static void main(String[] args){
        int[] arr = {1,2,7,56,34};
        printLargest(arr);
    }
}

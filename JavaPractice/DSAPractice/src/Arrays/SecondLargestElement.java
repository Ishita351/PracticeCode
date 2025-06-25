package Arrays;

public class SecondLargestElement {
    public static void printSecondLargest(int[] arr) {
        int lar = arr[0];
        int secLar = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > lar) {
                secLar = lar;
                lar = arr[i];
            } else if (arr[i] < lar && arr[i] > secLar) {
                secLar = arr[i];
            }
        }
        System.out.println(secLar);
    }
    public static void main(String[] args){
        int[] arr = {1,2,7,56,34};
        printSecondLargest(arr);
    }
}

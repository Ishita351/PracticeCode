package tech.blueglacier.arrays;

public class LeftRotateArrayByN {
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void arrayRotate(int[] arr, int n) {
        int length = arr.length;
        n = n % length; // In case n > length
        if (n == 0) {
            return;
        }
        // Step 1: Reverse first n elements
        reverse(arr, 0, n - 1);

        // Step 2: Reverse the rest
        reverse(arr, n, length - 1);

        // Step 3: Reverse the whole array
        reverse(arr, 0, length - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = 3;
        arrayRotate(arr, n);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

package tech.blueglacier.arrays;

public class MoveAllZeroToEnd {
    public static int[] moveZero(int[] arr) {
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == -1) return arr;
        for (int i = j + 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 4, 5, 0, 6, 7};
        int[] ans = moveZero(arr);
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}

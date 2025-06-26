package Arrays;

public class MaxConsecutiveOnes {
    public static int maxOnes(int[] arr) {
        int cnt = 0;
        int maxi = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                cnt++;
                maxi = Math.max(maxi, cnt);
            } else {
                cnt = 0;
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 3, 1, 4, 5, 6, 1, 1, 1, 1, 7, 9, 10, 11};
        int ans = maxOnes(arr);
        System.out.println(ans);
    }
}

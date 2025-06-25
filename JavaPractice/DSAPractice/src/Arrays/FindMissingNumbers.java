package Arrays;

// finding missing numbers in an array where numbers are between 1 to n-1 and one of them is missing

public class FindMissingNumbers {
    public static int findNumber(int[] arr){
        int n = arr.length;
        int m= n+1; // because the passed array has one element less
        int main_sum = (m*(m+1))/2;
        int sum2= 0;
        for ( int i = 0 ; i < n ; i++){
            sum2 = sum2 + arr[i];
        }
        return (main_sum - sum2);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7 , 9, 10 ,11};
        int ans = findNumber(arr);
        System.out.println(ans);
    }
}

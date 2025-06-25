package Arrays;

// union of 2 sorted arrays
// brute : using HashSet

import java.util.ArrayList;
import java.util.List;

public class ArrayUnion {
    public void unionOfArrays(int[] arr1 , int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;
        List<Integer> union = new ArrayList<>();
        int  i = 0 ; int j = 0 ;
        while(i<n1 && j<n2){
            if (arr1[i] < arr2[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            } else if (arr1[i] > arr2[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            } else { // arr1[i] == arr2[j]
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
                j++;
            }
        }
        // Remaining elements in arr1
        while (i < n1) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }
        // Remaining elements in arr2
        while (j < n2) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }
        System.out.println("Union of arrays:");
        for (int num : union) {
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        ArrayUnion au = new ArrayUnion();
        int[] arr1 = {1, 2, 2, 3, 5};
        int[] arr2 = {2, 3, 4, 5, 6};

        au.unionOfArrays(arr1, arr2);
    }
}

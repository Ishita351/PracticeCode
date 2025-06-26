package tech.blueglacier.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayIntersection {
    public static List<Integer> intersectionOfArrays(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int n1 = arr1.length;
        int n2 = arr2.length;
        List<Integer> ans = new ArrayList<>();
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                ans.add(arr1[i]);
                i++;
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 5};
        int[] arr2 = {2, 3, 4, 5, 6};
        List<Integer> ans;
        ans = intersectionOfArrays(arr1, arr2);
        System.out.println("Intersection of arrays:");
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}


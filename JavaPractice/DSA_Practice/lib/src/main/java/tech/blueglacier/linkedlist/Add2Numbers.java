package tech.blueglacier.linkedlist;

import java.util.LinkedList;

public class Add2Numbers {
    public static LinkedList<Integer> addLL(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        LinkedList<Integer> result = new LinkedList<>();
        int carry = 0;
        int i = 0, j = 0;
        while (i < l1.size() || j < l2.size() || carry > 0) {
            int sum = carry;
            if (i < l1.size()){
                sum += l1.get(i);
                i++;
            }
            if (j < l2.size()) {
                sum += l2.get(j);
                j++;
            }
            result.add(sum % 10);
            carry = sum / 10;
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(5);
        l1.add(3);
        l1.add(1);

        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(8);
        l2.add(9);
        l2.add(5);
        l2.add(4);

        LinkedList<Integer> result = addLL(l1, l2);
        System.out.println(result); // [3, 3, 7, 4]
    }
}


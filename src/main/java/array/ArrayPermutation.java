package array;

import java.util.HashMap;
import java.util.Map;

public class ArrayPermutation {

    /*

    Your are given two integer arrays. Write a program to check if they are permutation of each other.

Example

int[] array1 = {1,2,3,4,5};
int[] array2 = {5,1,2,3,4};
permutation(array1, array2)


     */

    public boolean permutation(int[] array1, int[] array2){
        if (array1.length != array2.length) {
            return false;
        }

        Map<Integer, Integer> freqCount1 = new HashMap<>();
        Map<Integer, Integer> freqCount2 = new HashMap<>();

        for (int num : array1) {
            freqCount1.put(num, freqCount1.getOrDefault(num, 0) + 1);
        }

        for (int num : array2) {
            freqCount2.put(num, freqCount2.getOrDefault(num, 0) + 1);
        }

        return freqCount1.equals(freqCount2);
    }

    public static void main(String[] args) {
        ArrayPermutation arrayPermutation = new ArrayPermutation();

        int[] array1 = {1,1,2,3,4,5};
        int[] array2 = {5,1,1,2,3,4};

        boolean b=arrayPermutation.permutation(array1,array2);
        System.out.println(b);


    }
}

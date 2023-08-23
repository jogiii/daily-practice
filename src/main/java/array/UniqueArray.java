package array;

import java.util.HashMap;

public class UniqueArray {
    /*
    Write a program to check if an array is unique or not.
    Example
        int[] intArray = {1,2,3,4,5,6};
        isUnique(intArray) // true
     */

    public boolean isUnique(int[] intArray) {
        // TODO

        HashMap<Integer,String> uniqueMap = new HashMap<>();

        for(int i=0;i<intArray.length;i++){
            String value = uniqueMap.put(intArray[i],"0");
            if(value != null)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        UniqueArray uniqueArray = new UniqueArray();
        int[] intArray = {1,2,3,4,5,5,6};
        uniqueArray.isUnique(intArray);
    }
}

package array;

public class BinarySearch {
    /*

    Write a program to to check if an array contains a number in Java.

    int[] intArray = {1,2,3,4,5,6};
    searchInArray(intArray, 6); // 5
     */

    public static int searchInArray(int[] intArray, int valueToSearch) {


        return binarySearch(intArray,0,intArray.length-1,valueToSearch);

       }


    public static int binarySearch(int[] intArray, int low, int max, int targetValue){


        while (low <= max){


            int mid = low + (max-low)/2;

            if(intArray[mid] == targetValue)
                return mid;

            else if(intArray[mid] < targetValue)
                low = mid+1;

            else
                max = mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,6};
        int i = searchInArray(intArray, 6);
        System.out.println(i);
    }

}

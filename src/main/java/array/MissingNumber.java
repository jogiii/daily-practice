package array;

public class MissingNumber {
    /*


    Write Java function called findMissingNumberInArray that takes an integer array containing
     n-1 unique elements from a range of 1 to n, with one missing number, and returns the missing number.
    Example
        myArray = {1,2,3,4,6}
        findMissingNumberInArray(myArray, 6) // 5
     */

    static int findMissingNumberInArray(int[] arr) {
        // TODO
        int sum =0;

        int n = arr.length+1;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        int totalSum = (n*(n+1))/2;

        return totalSum - sum;
    }

    public static void main(String[] args) {
        int [] myArray = {1,2,3,4,6};
       int a = findMissingNumberInArray(myArray);
        System.out.println(a);
    }

}

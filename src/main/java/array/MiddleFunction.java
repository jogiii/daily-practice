package array;

public class MiddleFunction {

    /*

    Write a function called middle that takes an array
    and returns a new array that contains all but the
    first and last elements.
        myArray = [1, 2, 3, 4]
        middle(myArray)  # [2,3]
     */

    public static int[] middleFunction(int [] array){
        int [] finalArr = new int[array.length-2];
        for(int i=0;i<array.length-2;i++){
            finalArr[i] = array[i+1];
        }
        return finalArr;
    }

    public static void main(String[] args) {
        int []  myArray = {1, 2, 3, 4};

        middleFunction(myArray);
    }
}

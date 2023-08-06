package array;

public class BestScore {



    /*
    Given an array, write a function to get first, second best scores from the array and return it in new array.
    Array may contain duplicates.
        Example
            myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
            firstSecond(myArray) // {90, 87}
     */
    public static void main(String[] args) {
        int[] myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};

        int[] d =findTopTwoScoresV2(myArray);
        for(int a : d){
            System.out.println(a);
        }

    }


    //o(1)
    public static int[] findTopTwoScoresV2(int[] array) {
        int firstHighest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int score : array) {
            if (score > firstHighest) {
                secondHighest = firstHighest;
                firstHighest = score;
            } else if (score > secondHighest && score < firstHighest) {
                secondHighest = score;
            }
        }

        return new int[]{firstHighest, secondHighest};
    }
    public static int[] findTopTwoScores(int[] array){
       // TODO
        int[] finalInt = new int[2];
        int[] sorted =sortArray(array);

        finalInt[0] =sorted[sorted.length-1];
        finalInt[1] = sorted[sorted.length-2];

        return finalInt;
    }


    public static int[] sortArray(int [] array){
        int [] sortedArray = new int[array.length];
        //bubble sort

        int temp;
        for(int i =0;i<array.length-1;i++){
            for(int j =0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }


        }
        return  array;
    }
}

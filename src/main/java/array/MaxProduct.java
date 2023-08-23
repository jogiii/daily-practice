package array;

public class MaxProduct {
    /*
    How to find maximum product of two integers in the array where all elements are positive.
    Example
        int[] intArray = {10,20,30,40,50};
        maxProduct(intArray) // (40,50)
     */
    public String maxProduct(int[] intArray) {
        // TODO


        int max =0;
        int secondMax =0;
        for(int i=1;i<intArray.length;i++){
            if(intArray[max] < intArray[i]){
                max = i;
            }
        }

        for(int i=1;i<intArray.length;i++){
            if(intArray[secondMax] < intArray[i]){
                if(i == max){

                }else {
                    secondMax = i;
                }

            }
        }
        return "(" +intArray[secondMax]+", "+intArray[max]+")";
    }

    public static void main(String[] args) {
        MaxProduct mp = new MaxProduct();
        int[] intArray = {2,3,-2,4};
        String s = mp.maxProduct(intArray);
        System.out.println(s);
    }
}

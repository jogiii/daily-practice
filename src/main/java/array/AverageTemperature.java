package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageTemperature {

    public static float calculateAverage(int [] arr){
        float average =0;
        float sum =0;

        for(int i=0;i<arr.length;i++){
            sum +=arr[i];


        }
        average = sum/arr.length;
        return average;
    }

    public static ArrayList<Integer> findAboveAverage(float average, int[] arr){
        ArrayList<Integer> aboveAverageDays = new ArrayList<>();
        for(int i=0;i< arr.length;i++){
            if(arr[i] > average)
                aboveAverageDays.add(arr[i]);

        }
        return aboveAverageDays;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of days");
        int noOfDays = sc.nextInt();
        int[] arr = new int[noOfDays];
        for(int i=0;i<noOfDays;i++){
            System.out.println("Enter temperature for day "+ (i+1));
            int value = sc.nextInt();
            arr[i] = value;
        }

        float i = calculateAverage(arr);
        System.out.println("Average value is "+i);

        ArrayList<Integer> l =findAboveAverage(i,arr);
        System.out.println("Above average list "+l);
    }


}

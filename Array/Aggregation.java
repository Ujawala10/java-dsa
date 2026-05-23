package Array;

import java.util.Arrays;

public class Aggregation {

    public static void main(String[] args) {

        int[] arr = {2,4,6,8};

        int sum = 0;

        // Mean
        for(int i = 0; i < arr.length; i++) {

            sum += arr[i];
        }

        double mean = (double) sum / arr.length;

        System.out.println("Mean is: " + mean);

        // Sort array for median
        Arrays.sort(arr);

        double median;

        // Even length
        if(arr.length % 2 == 0) {

            int middle1 = arr[(arr.length / 2) - 1];
            int middle2 = arr[arr.length / 2];

            median = (middle1 + middle2) / 2.0;

        }

        // Odd length
        else {

            median = arr[arr.length / 2];
        }

        System.out.println("Median is: " + median);
    }
}
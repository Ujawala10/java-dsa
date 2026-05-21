//1. Maximum Sum Subarray of Size K

package Array;

public class Sliding{
    public static void main(String[] args){
        int[] arr = {1,12,-5,-6,50,3};
        int k = 4;
        int windowSum = 0;
        
        for(int i = 0; i < k; i++){
            windowSum += arr[i];
        }

        int max = windowSum;

        for(int i = k; i < arr.length; i++){
            windowSum = windowSum - arr[i-k] + arr[i];

            if(windowSum > max){
                max = windowSum;
                ;
            }
        }

        double avg = (double) max / k;

        System.out.println("The maximum average is " + avg);
    } 
}
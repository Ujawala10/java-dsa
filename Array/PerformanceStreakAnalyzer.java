package Array;


import java.util.Scanner;

public class PerformanceStreakAnalyzer {
    public static void main(String[] args) {

        System.out.println("Student Performance Streak Analyzer");
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter number of test scores");
        int num = sc.nextInt();

        System.out.println("Enter window size");
        int k = sc.nextInt();
        
        int[] scores = new int[num];
        System.out.println("Enter the scores");
        for(int i =0; i < num; i++){
            scores[i] = sc.nextInt();
        }

        System.out.print("Student Scores: ");
        for(int i = 0; i < num; i++){
           System.out.print(scores[i] + " ");
        }

        int windowSum = 0;
        int maxSum = windowSum;

        for(int i = 0; i < k; i++){
            windowSum += scores[i];
        }

        for(int i = k; i < num; i++){
            windowSum = windowSum - scores[i - k] + scores[i];

            if(windowSum > maxSum){
                maxSum = windowSum;
            }
        }

        double avg = (double) maxSum / k;

        System.out.println("Best Streak " + maxSum);
        System.out.println("Average " + avg);


    }
    
}

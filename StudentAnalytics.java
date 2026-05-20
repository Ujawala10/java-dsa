package Array;

import java.util.Scanner;

public class StudentAnalytics {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("STUDENT ANALYTICS SYSTEM");

        System.out.println("Enter number of students");
        int num = sc.nextInt();

        int[] marks = new int[num];

        System.out.println("Enter Students Marks");
        for(int i = 0; i < num; i++){
            marks[i] = sc.nextInt();
        }

        System.out.print("Student Marks: ");
        for(int i = 0; i < num; i++){
           System.out.print(marks[i] + " ");
        }
        

        //Highhest Marks
        int max = marks[0];
        for(int i = 1; i < num; i++){
            if(max < marks[i]){
                max = marks[i];
            }
        }

        System.out.println("Highest Marks: " + max);
        

        //Average Marks
        int sum = marks[0];
        for(int i = 1; i < num; i++){
            sum += marks[i];
        }

        double avg = (double) sum/num;

        System.out.println("Average Marks: " + avg);
    }
    
}
  

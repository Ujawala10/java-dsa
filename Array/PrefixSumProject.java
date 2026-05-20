package Array;

import java.util.Scanner;

public class PrefixSumProject {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter number of Students: ");
        int num = sc.nextInt();

         int[] marks = new int[num];
          System.out.println("Enter marks of students");
          for(int i = 0; i < num; i++){
            marks[i] = sc.nextInt();
          }

          System.out.print("Student Marks: ");
        for(int i = 0; i < num; i++){
           System.out.print(marks[i] + " ");
        }
        
        int[] prefix = new int[marks.length];
        prefix[0] = marks[0];
        int sum;

        for(int i = 1; i < marks.length; i++){
            prefix[i] = prefix[i-1] + marks[i];
        }

        System.out.println("Prefix array");
        for(int i = 0; i < prefix.length; i++){
            System.out.print(prefix[i] + " " );
        }

        System.out.println("Enter starting index: ");

        int L = sc.nextInt();
         System.out.println("Enter ending index: ");

        int R = sc.nextInt();

        if(L==0){
            sum = prefix[R];
        }else{
            sum = prefix[R] - prefix[L-1];
        }

        System.out.println("Total marks from index " +  L  + 
        " to " +  R  +  
        " is: " + sum);

    }
}

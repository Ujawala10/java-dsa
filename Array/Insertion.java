package Array;

import java.util.Arrays;

public class Insertion {

    public static void main(String[] args) {

        int[] arr1 = {1,2,4,5};
        int[] arr2 = {2,3,5};

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0;
        int j = 0;

        System.out.println("Common Elements:");

        while(i < arr1.length && j < arr2.length) {

            // Common element found
            if(arr1[i] == arr2[j]) {

                System.out.print(arr1[i] + " ");

                i++;
                j++;
            }

            // arr1 element smaller
            else if(arr1[i] < arr2[j]) {

                i++;
            }

            // arr2 element smaller
            else {

                j++;
            }
        }
    }
}
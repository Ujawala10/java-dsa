//Find Smallest Element in Array

package Array;

public class SmallestNumber {

    public static void main(String[] args) {

        int[] arr = {7, 2, 9, 1, 5};

        int smallestNumber = arr[0];

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] < smallestNumber) {

                smallestNumber = arr[i];
            }
        }

        System.out.println("Smallest Number: " + smallestNumber);
    }
}
package Array;

public class Sorted {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {2,5,6};

        int[] merged = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        // Compare elements
        while(i < arr1.length && j < arr2.length) {

            if(arr1[i] < arr2[j]) {

                merged[k] = arr1[i];

                i++;

            } else {

                merged[k] = arr2[j];

                j++;
            }

            k++;
        }

        // Remaining elements of arr1
        while(i < arr1.length) {

            merged[k] = arr1[i];

            i++;
            k++;
        }

        // Remaining elements of arr2
        while(j < arr2.length) {

            merged[k] = arr2[j];

            j++;
            k++;
        }

        System.out.println("Merged Array:");

        for(int x = 0; x < merged.length; x++) {

            System.out.print(merged[x] + " ");
        }
    }
}
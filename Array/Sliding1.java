//2. Maximum Average Subarray

package Array;

public class Sliding1 {

    public static void main(String[] args) {

        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};

        int k = 3;

        
        for(int i = 0; i <= arr.length - k; i++) {

            boolean found = false;

           
            for(int j = i; j < i + k; j++) {

                if(arr[j] < 0) {

                    System.out.print(arr[j] + " ");

                    found = true;

                    break;
                }
            }

            
            if(found == false) {

                System.out.print("0 ");
            }
        }
    }
}
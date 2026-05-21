//3. Count Distinct Elements in Every Window

package Array;

public class Sliding2 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 3, 4, 2, 3};

        int k = 4;

        
        for(int i = 0; i <= arr.length - k; i++) {

            int distinctCount = 0;

            
            for(int j = i; j < i + k; j++) {

                boolean isDistinct = true;

                
                for(int p = i; p < j; p++) {

                    if(arr[j] == arr[p]) {

                        isDistinct = false;

                        break;
                    }
                }

                
                if(isDistinct) {

                    distinctCount++;
                }
            }

            System.out.print(distinctCount + " ");
        }
    }
}
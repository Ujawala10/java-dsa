package Array;

public class TwoPointersDuplicate {

    public static void main(String[] args) {

        int[] arr = {1,1,2,2,3};

        int left = 0;
        int right = 1;

        while(right < arr.length) {

            // New unique element found
            if(arr[left] != arr[right]) {

                left++;

                arr[left] = arr[right];
            }

            // Move fast pointer
            right++;
        }

        System.out.print("Unique Elements: ");

        for(int i = 0; i <= left; i++) {

            System.out.print(arr[i] + " ");
        }
    }
}
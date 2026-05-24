package Array;

public class MoveZeros {

    public static void main(String[] args) {

        int[] arr = {0,1,0,3,12};

        int slow = 0;

        for(int fast = 0; fast < arr.length; fast++) {

            if(arr[fast] != 0) {

                int temp = arr[fast];
                arr[fast] = arr[slow];
                arr[slow] = temp;

                slow++;
            }
        }

        System.out.println("Array after moving zeroes:");

        for(int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }
}
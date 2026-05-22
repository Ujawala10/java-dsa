package Array;

public class TwoPointers {

    public static void main(String[] args) {

        int[] arr = {2, 4, 7, 11, 15};

        int target = 18;

        int L = 0;
        int R = arr.length - 1;

        while(L < R) {

            int sum = arr[L] + arr[R];

            if(sum == target) {

                System.out.println(
                    "Target Found: "
                    + arr[L] + " + "
                    + arr[R] + " " + " = " + sum
                );

                break;
            }

            else if(sum < target) {

                L++;
            }

            else {

                R--;
            }
        }
    }
}
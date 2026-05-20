package Array;

public class Prefix {

    public static void main(String[] args) {

        int[] arr = {4, 8, 1, 6, 3, 9};

        int[] prefix = new int[arr.length];

        // First element
        prefix[0] = arr[0];

        // Build prefix array
        for(int i = 1; i < arr.length; i++) {

            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Print prefix array
        System.out.println("Prefix Array:");

        for(int i = 0; i < prefix.length; i++) {

            System.out.print(prefix[i] + " ");
        }

        System.out.println();

        // Query
        int L = 1;
        int R = 4;

        int sum;

        if(L == 0) {

            sum = prefix[R];
        }
        else {

            sum = prefix[R] - prefix[L - 1];
        }

        System.out.println(
            "Sum from index " + L +
            " to " + R +
            " is: " + sum
        );
    }
}
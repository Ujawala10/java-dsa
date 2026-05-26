package Array;

public class PrefixSum {
    public static void main(String[] args) {
        
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6};
        int n = arr.length;

        // Build prefix
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Query L=2, R=5
        int L = 2, R = 5;
        int sum = prefix[R] - prefix[L - 1];

        System.out.println("Sum from index 2 to 5 = " + sum); // 19
    }
}
    
    


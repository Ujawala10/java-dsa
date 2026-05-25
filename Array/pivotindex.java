package Array;

public class pivotindex {
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 6};
        
        int totalsum = 0;

        for(int i = 0; i < arr.length; i++){
            totalsum += arr[i];
        }

        int leftsum = 0;
        for(int i = 0; i < arr.length; i++){
            int rightsum = totalsum - leftsum - arr[i];

             if(leftsum == rightsum) {
                System.out.println("Pivot Index: " + i);
                return;
            }

            leftsum += arr[i];
        }
        System.out.println("No Pivot Index Found");
    }
    
}

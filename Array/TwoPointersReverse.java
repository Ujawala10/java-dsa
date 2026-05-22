package Array;

public class TwoPointersReverse {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int[] rev = new int[arr.length];
        int left = 0;
        int right = arr.length-1;
        int temp = 0;

        while(left < arr.length){
            rev[left] = arr[right];

            left++;
            right--;
        }

        System.out.println("Reverse Array");

        for(int i = 0; i < rev.length; i++){
            System.out.print(rev[i] + " ");
        }

    }
    
}

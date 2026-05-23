package Array;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {8,3,12,5,10};
        int largest = arr[0];
        int secondLargest = -1;
        int temp = 0;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > largest){
                temp = largest;
                largest = arr[i];
                secondLargest = temp;
            }else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }

        System.out.println("Largest Number is: " + largest + "\nSecond Largest is: " + secondLargest);
    }
    
}

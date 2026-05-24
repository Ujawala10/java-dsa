package Array;

public class Insertionthree {
    public static void main(String[] args) {
        int[] arr1 = {1,5,10};
        int[] arr2 = {3,4,5,10};
        int[] arr3 = {5,10};

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < arr1.length && j < arr2.length && k < arr3.length){
          if(arr1[i] == arr2[j] && arr3[k] == arr2[j]){
            System.out.print(arr1[i] + " ");

            i++;
            j++;
            k++;
          }  else if(arr1[i] < arr2[j] && arr1[i] < arr3[k]) {

            i++;
            }else if(arr2[j] < arr1[i] && arr2[j] < arr3[k]){
                j++;
            }else{
                k++;
            }
    }
    
}
}

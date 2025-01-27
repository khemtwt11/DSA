package DSA.Algorithms.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSortImplemenation(int[] arr){
        boolean isSwapped = false;
       for(int i=0;i<arr.length-1;i++){
           for(int j=0;j<arr.length-1-i;j++){
               isSwapped = false;
               if(arr[j]>arr[j+1]){
                   isSwapped = true;
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }
           if(!isSwapped) return ;
       }
    }

    public static void main(String[] args) {
        int[] arr = {1,3,2,6,6,5,4,9,0};
        bubbleSortImplemenation(arr);
        System.out.println(Arrays.toString(arr));

    }

}

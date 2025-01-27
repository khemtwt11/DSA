package DSA.Algorithms.Sorting;
import java.util.Arrays;

/*
1. we make multiple passes through the array
2. For every pass, we compare the adjacent element
3. We swap elements, if they are in wrong order( either ascending or descending)
4. After each pass we 'bubble up' the element to it's correct position based on its order
5. We perform this process for n-1 times, or no until no swap needed in a pass.
 */

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

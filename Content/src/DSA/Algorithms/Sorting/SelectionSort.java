package DSA.Algorithms.Sorting;

/*
 1. For every iteration the algorithm finds the smallest(or largest) element and swap it with the first element of unsorted array.
 3. Here the array is divided into two parts : sorted and unsorted array
 4. Initially, the sort part is empty
 6. There are n-1 iteration if n is the number of elements.
 7. The time complexity is (O^2)
 */

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSortImplementation(int[] arr){
        for (int i=0;i<arr.length;i++){
            int minIndex = i;

            for(int j = i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){ // change the condition to change the order
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,0,5,4,9,7,6,11,10};
        selectionSortImplementation(arr);
        System.out.println(Arrays.toString(arr));
    }
}

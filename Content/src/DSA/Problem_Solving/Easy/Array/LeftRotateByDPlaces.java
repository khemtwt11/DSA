package DSA.Problem_Solving.Easy.Array;
// left rotate the array by D places.

import DSA.Data_Structures.Array;
import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class LeftRotateByDPlaces {
    /*
   I Approach Naive approach : O(d*n)
    public static void leftRotateUsingNestedLoop(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
*/

/*
  II Approach : O(N+3) roughly and O(d) extra space

    public static void leftRotateUsingTempArray(int[] arr,int d){
        int n = arr.length;
        int[] tempArray = new int[d];
        for(int i=0;i<d;i++){
            tempArray[i] = arr[i];
        }

        for(int i = 0;i<n-d;i++){
            arr[i] = arr[d+i];
        }

        for(int i=0;i<tempArray.length;i++){
            arr[n-d+i] = tempArray[i];
        }

        System.out.println(Arrays.toString(arr));
    }
 */

    public static void LeftRotateUsingReverse(int[] arr, int start,int end){
        end--;
        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        };
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int n = arr.length;
        int d = 3;
        int start = 0;
       /* I Approach
        for(int i=0;i<d;i++){
            leftRotateUsingNestedLoop(arr);
        }

        */

        /*
         II Approach
       leftRotateUsingTempArray(arr,d);

         */

        // III Approach : using reverse method
        LeftRotateUsingReverse(arr,start,d);
        LeftRotateUsingReverse(arr,d,n);
        LeftRotateUsingReverse(arr,start,n);
        System.out.println(Arrays.toString(arr));

    }
}

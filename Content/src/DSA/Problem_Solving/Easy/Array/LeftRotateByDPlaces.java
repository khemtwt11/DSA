package DSA.Problem_Solving.Easy.Array;
// left rotate the array by D places.

import DSA.Data_Structures.Array;

import java.util.Arrays;

public class LeftRotateByDPlaces {
    public static void leftRotate(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int d = 3;

        for(int i=0;i<d;i++){
            leftRotate(arr);
        }
        System.out.println(Arrays.toString(arr));
    }
}

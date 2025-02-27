package DSA.Problem_Solving.Easy.Array.Binary_Search;

import java.util.Arrays;

public class RightRotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(arr,k);
        System.out.println(Arrays.toString(arr));

    }

    static void rotate(int[] arr, int k) {
        k = k%arr.length;
        int n = arr.length;
        if(k==0) return;
        reverse(arr, 0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);

    }

    public static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
}

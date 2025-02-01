package DSA.Problem_Solving.Easy.Array;

import java.util.Arrays;

public class LeftRotateArrayByOne {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};

        for(int i=1;i<arr.length;i++){
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

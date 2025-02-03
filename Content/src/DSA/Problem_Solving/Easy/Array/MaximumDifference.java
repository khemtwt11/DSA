package DSA.Problem_Solving.Easy.Array;
import java.lang.Math;
import java.util.Arrays;

/*
 Find maximum difference between two element such that j>i;
 */
public class MaximumDifference {
    public static void findMaximumDifferenceNaive(int[] arr ,int n){
        int result = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(arr[j]-arr[i]>result)
                {
                    result = arr[j]  - arr[i];
                }
            }
        }
        System.out.println(result);
    }

    public static void findMaximumDifferenceOptimized(int[]arr, int n){
        int minValueSoFar = arr[0];
        int result = arr[1]-arr[0];

        for(int i=1;i<n;i++){
            result = Math.max(result,arr[i]-minValueSoFar);
            minValueSoFar = Math.min(minValueSoFar,arr[i]);
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        int[] arr = new int[]{11,2,3,5,6,7,8};
        int n = arr.length;
//        findMaximumDifferenceNaive(arr,n);
        findMaximumDifferenceOptimized(arr,n);

    }

}

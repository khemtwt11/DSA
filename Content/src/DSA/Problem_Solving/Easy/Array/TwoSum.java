package DSA.Problem_Solving.Easy.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
// return the index of two elements whose sum is equal to k
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = new int[]{1,0,7,7,1};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr, target)));
        /*
        Naive approach : for every element first find the complement by subtracting the current element from the complement and check if the complement exists for the rest of the element present in the array
        Time complexity : O(N^2)
        Space complexity : O(1)
        boolean pairFound = false;
        for(int i=0;i<n;i++){
            int res = k -arr[i]; // k - arr[i] = arr[j]

            for(int j = i+1;j<n;j++){
                if(res == arr[j]){
                    pairFound = true;
                    System.out.println(i+" : "+j);
                    break;
                }
            }
            if(pairFound){
                break;
            }
        }
        if(pairFound==false) {
            System.out.println("pair not found");
        }

         */


    }

    static int[] twoSum(int[] arr, int target){
        Map<Integer,Integer> map = new HashMap<>();

        for(int i =0;i<arr.length;i++){
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(arr[i], i);

        }
       return new int[]{-1,-1};
    }
}

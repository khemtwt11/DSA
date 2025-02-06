package DSA.Problem_Solving.Easy.Array;

import java.util.ArrayList;

public class SubArrayStoredIn  {
    static ArrayList<ArrayList<Integer>> storeSubarray(int[] arr){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                ArrayList<Integer> temp = new ArrayList<>();
                for(int k=i;k<=j;k++){
                    temp.add(arr[k]);
                }
                res.add(temp);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        System.out.println(storeSubarray(arr));

    }
}

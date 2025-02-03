package DSA.Problem_Solving.Easy.Array;
/*
 element to right of which all elements are smaller than the element, that element is called a leader
 ex: {2,3,6,3,4,1]
 leaders {6,4,1} for these elements all the elements right to them in array are smaller than these.
 */

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {
    public static void findLeadersNaive(int[]arr, int n,ArrayList<Integer> resultArray){
        for(int i=0;i<n;i++){
            boolean ifLeader = true;
             for(int j = i+1;j<n;j++){
                 if(arr[i]<=arr[j]){
                     ifLeader = false;
                     break;
                 }
             }
             if(ifLeader)
             {
                  resultArray.add(arr[i]);
             }
        }
    }

    public  static  void findLeadersOptimize(int[]arr , int n, ArrayList<Integer> resultArray)
    {

        int curr_elem = arr[n-1];
        resultArray.add(curr_elem);

        for(int i = n-2;i>=0;i--){
            if(arr[i]>curr_elem){
                curr_elem = arr[i];
                resultArray.add(curr_elem);
            }
        }
        Collections.reverse(resultArray);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,4,3,2,1,1,1};
        int n = arr.length;
        ArrayList<Integer>  al = new ArrayList<>();

//        findLeadersNaive(arr,n,al);
        findLeadersOptimize(arr,n,al);
        System.out.println(al);
    }
}

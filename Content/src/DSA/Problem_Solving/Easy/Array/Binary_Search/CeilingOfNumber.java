package DSA.Problem_Solving.Easy.Array.Binary_Search;
/*
   Smallest number >= target is called ceiling of a number for example

   target = 5;
   ceiling of number  = 8
 */
public class CeilingOfNumber {
    public static void main(String[] args) {
       int[] arr = {1,2,4,5,5,5};
       int target = 6;
      int index = findCieling(arr,target);
        System.out.println(index);
    }


    static int findCieling(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(arr[mid]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }

        }
        return  start<arr.length? start : -1;
    }

}
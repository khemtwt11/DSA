package DSA.Algorithms.Searching.Array;

public class BinarySearch {
    static int binarySearchImplementation(int[]arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(arr[mid]==target){
              return  mid;
            }else if(arr[mid]>target){
                end = mid-1;
            }else{
                start = mid+1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {-9,2,3,4,5,6,7,8};
        int target = -9;
        int index = binarySearchImplementation(arr,target);
        System.out.println(index);
    }
}

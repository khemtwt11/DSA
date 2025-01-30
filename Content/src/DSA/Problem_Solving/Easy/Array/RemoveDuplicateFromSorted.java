package DSA.Problem_Solving.Easy.Array;
//Given an array, remove the duplicate values from the array without using extra space


public class RemoveDuplicateFromSorted {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,1,1,1,1,1,1,1};
        int index = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                arr[index++] = arr[i];
            }
        }

        System.out.println(index+1);
    }
}

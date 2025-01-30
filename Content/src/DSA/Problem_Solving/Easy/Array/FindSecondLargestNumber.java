package DSA.Problem_Solving.Easy.Array;
// Find the second largest number in the array
public class FindSecondLargestNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{10,10,10};
        int max  = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                 sMax = max;
                 max = arr[i];
            }
            else if(sMax<arr[i] && arr[i]<max){
                     sMax = arr[i];
            }
        }

        System.out.println(sMax);
    }
}

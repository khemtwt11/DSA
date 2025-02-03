package DSA.Problem_Solving.Easy.Array;
// find the frequency of all the elements in the given array;

public class FrequencyInSortedArray {
    public static void findFrequencyInSortedArray(int[] arr, int n ){
        int count = 1;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){
                System.out.println(arr[i-1]+" : "+count);
                count = 1;
            }else{
                count++;
            }

            if(i==n-1){
                System.out.println(arr[i]+" : "+count);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{10,20,30,40,50,60};
        int n = arr.length;
        findFrequencyInSortedArray(arr,n);
    }
}

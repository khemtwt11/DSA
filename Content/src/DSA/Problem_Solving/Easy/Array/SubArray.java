package DSA.Problem_Solving.Easy.Array;
/*
Subarray : print all the possible pair which are contiguous within the array
total number of subarray in an array are : n(n+1)/2
 */
public class SubArray {
    public static void main(String[] args) {
     int[] arr =  {1,2,3,4,5};
      String s = printSubarray(arr);
        System.out.println(s);
    }


    public static String printSubarray(int[] arr){
        for( int i =0;i<arr.length;i++){
            for( int j = i;j<arr.length;j++){
                 String s = "";
                 for(int k=i;k<=j;k++){
                    s+=arr[k];
                    if(k<j){
                        s+=",";
                    }
                 }
                System.out.println("{"+ s + "}");

            }
        }
    return "total number of subarrays are: "+(arr.length*(arr.length+1))/2;
    }




}

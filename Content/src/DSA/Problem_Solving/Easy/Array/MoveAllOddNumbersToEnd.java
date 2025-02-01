package DSA.Problem_Solving.Easy.Array;

import java.util.Arrays;

// An array is given with both even and odd numbers, move all the odd numbers to end.
public class MoveAllOddNumbersToEnd {
    public static void main(String[] args) {
        int[] arr = new int[]{1,13,2,3,4,5,6,7,8,10,};

        /*
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
               for(int j = i+1;j<arr.length;j++){
                    if(arr[j]%2==0){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        break;
                    }
               }
            }
        }
         */

        int track = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                int temp = arr[track];
                arr[track] = arr[i];
                arr[i] = temp;
                track++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }


}

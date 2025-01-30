package DSA.Problem_Solving.Easy.Array;

import DSA.Data_Structures.Array;

import java.util.Arrays;

public class MoveAllZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = new int[]{0,0,0,1,2,3,5,0};

//        for(int i=0;i<arr.length-1;i++){
//             if(arr[i]==0){ // finding zeroes here to swap it with non zero values
//                 for(int j=i+1;j<arr.length;j++){ // checking non zero value after the zero value found.
//                     if(arr[j]!=0){
//                         int temp  = arr[j];
//                         arr[j] = arr[i];
//                         arr[i] = temp;
//                         break;
//                     }
//                 }
//             }
//
//        }
//

        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));


    }
}

package DSA.Problem_Solving.Easy.Array;
import java.util.Arrays;
public class ArrayReverse {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int i=0;
        int j = arr.length-1;
        while(i<j){
            int temp  = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}

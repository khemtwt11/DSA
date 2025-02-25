package DSA.Problem_Solving.Easy.Maths;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] num = {9,9,9,9};
        System.out.println(Arrays.toString(plusOne(num)));
    }

    static int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=n-1;i>=0;i--){

            if(digits[i]<9){
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] res = new int[n+1];
        res[0] = 1;
        return res;
    }
}

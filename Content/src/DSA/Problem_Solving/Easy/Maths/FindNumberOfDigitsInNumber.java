package DSA.Problem_Solving.Easy.Maths;
import java.lang.Math;
public class FindNumberOfDigitsInNumber {
    public static void main(String[] args) {
        int a = 124567890;
        int result = (int) Math.log10(a)+1;
        System.out.println(result);
    }
}

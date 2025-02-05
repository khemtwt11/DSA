package DSA.Problem_Solving.Easy.Array;

// count number of digits in a number


public class CountNumberOfDigits {
    static int countOfDigits(int num){
        int count = 0;
        while(num>0){
            num = num/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int num = 1;
        int result = countOfDigits(num);
        System.out.println(result);
    }
}

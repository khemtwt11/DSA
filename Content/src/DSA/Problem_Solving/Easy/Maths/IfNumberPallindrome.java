package DSA.Problem_Solving.Easy.Maths;
// Not good way to find reverse as easy way would be to just reverse the number and compare with the actual number but if we want to find the the digits of the number from start to end one by one this can be used.
public class IfNumberPallindrome {
    public static void main(String[] args) {
        int num = 12321;
        boolean res = findIfNumberIsPallindrome(num);
        System.out.println(res);

    }

    static boolean findIfNumberIsPallindrome(int num){
        int duplicate = num;
        int result = 0;

        while(duplicate>0){

            int digitFromRight = duplicate%10;
            result = result*10+digitFromRight;
            duplicate = duplicate/10;
        }

        return result == num;
    }

//    static boolean findIfNumberIsPallindrome(int value) {
//        int res = (int) Math.log10(value);
//        double num = value;
//        for (int i = res; i >= res/2; i--) {
//            // find first digit of a number
//            num = num / Math.pow(10, i);
//            int digitFromStart = (int) num;
//            num = ((num * Math.pow(10, i)) % (digitFromStart * Math.pow(10, i)));
//
//
//            // find last digit
//            int digitFromLast = (int) (value%10);
//            value = value/10;
//
//            if(digitFromStart!=digitFromLast){return false;}
//
//        }
//        return true;


}

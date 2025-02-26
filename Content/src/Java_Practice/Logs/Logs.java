package Java_Practice.Logs;
import java.lang.Math;

// Using Log base 10 to print the digits of a number from start to end.
public class Logs {
    public static void main(String[] args) {

        double valueFound = 5679229;
        int res = (int) Math.log10(valueFound);

        for(int i=res;i>=0;i--){

            // find first digit of a number
            valueFound =  valueFound/Math.pow(10,i);
            int temp = (int) valueFound;
            valueFound =  ((valueFound*Math.pow(10,i))%(temp*Math.pow(10,i)));

   }
    }
}

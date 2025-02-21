package DSA.Problem_Solving.Easy.Maths;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String roman_number = "XLIV";
        System.out.println(convertRomanToInteger(roman_number));
    }

    static int convertRomanToInteger(String s){
        int i = 0;
        int j = 1;
        int sum = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);


        while(j<s.length()){
            int first = map.get(s.charAt(i));
            int second = map.get(s.charAt(j));
            if(first>=second){
                sum+=first;
            }else{
                sum-=first;
            }
            i++;
            j++;
        }
        sum+=map.get(s.charAt(s.length()-1));
        return sum;
    }
}

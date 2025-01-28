package DSA.Problem_Solving.Easy.String;

import Java_Practice.String.Strings;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Gaurav";
        char[] ch = s.toCharArray();

/*

 System.out.println(ch.getClass().getSimpleName()); returns the type of the array (char[])
 System.out.println("String".getClass().getSimpleName()); (String)
 System.out.println((new String[] {"gaurav","saurav","manish"}).getClass().getSimpleName()); (String[])


 Instance way to check the data type of a variable
   System.out.println(ch instanceof char[]); (true)
 */

        for(int i=0;i<ch.length/2;i++){
           char temp = ch[i];
           ch[i] = ch[ch.length-i-1];
           ch[ch.length-i-1] = temp;
        }

        System.out.println(ch);

//        for(int i=0;i<ch.length;i++){
//            System.out.println(ch[i]);
//        }


//        int[] arr = {1,2,3,4,5,6}; printing the array here returns a string representation of it's reference
//        System.out.println(arr);

    }

}

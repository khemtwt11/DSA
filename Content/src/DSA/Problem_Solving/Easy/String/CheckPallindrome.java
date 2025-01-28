package DSA.Problem_Solving.Easy.String;

public class CheckPallindrome {

    public static boolean checkPallindrome(String sh){
/*

        char[] ch = sh.toCharArray(); extra space O(n)

        for(int i=0;i<ch.length/2;i++){
            if(ch[i]!=ch[ch.length-i-1]) return false;
        }
*/


        for(int i=0;i<sh.length();i++){
            if(sh.charAt(i)!=sh.charAt(sh.length()-i-1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anmana";
        System.out.println(checkPallindrome(s));

    }
}

/*
Array and string both are object but
1. In case of array as the value is pass by reference we can see that the value of array get's modified if we
change the value within the function where the array got send.

2. As string is immutable in java, The behaviour is different, when we try to modify the string it actually creates
a new string instead of modifying the actual one which got passed in function parameter. Therefore, it doesn't affect
the actual string value
 */

package DSA.Problem_Solving.Easy.String;

import java.util.Arrays;

public class ReverseVowelsInString {
    public static boolean checkVowel(char ch){
        char letter = Character.toLowerCase(ch);
        return letter != 'a' && letter != 'e' && letter != 'i' && letter != 'o' && letter != 'u';
    }

    public static void main(String[] args) {
        String s   = "You can do it"; // Yio can du it
        char[] ch = s.toCharArray();
        int i = 0;
        int j = ch.length-1;
        while(i<j){

            while(i<j && checkVowel(ch[i])){
                i++;

            }

            while(i<j && checkVowel(ch[j])){
                j--;
             }

            if(i>j) break;
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;

            i++;
            j--;
        }
        System.out.println(ch);
    }

}

package DSA.Problem_Solving.Easy.String;

import java.util.Arrays;

public class StringToLowercase {
    public static void main(String[] args) {
        String s = "Math Is YOuR lAngUagE";

        char[] ch = s.toCharArray();

        for( int i=0;i<ch.length;i++){
           if(ch[i]>='A' && ch[i]<='Z'){
               ch[i] = (char)(ch[i]-'A'+'a');
           }
        }

        System.out.print(ch);
    }
}

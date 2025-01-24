package DSA.Problem_Solving.Easy.String;

public class RemoveVowels {
    public static void main(String[] args) {
        String sr = "Welcome to City";
        for(int i=0;i<sr.length();i++){
            char ch = Character.toLowerCase(sr.charAt(i));
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'|| ch==' '){
                continue;
            }
            System.out.print(ch);
        }



    }
}

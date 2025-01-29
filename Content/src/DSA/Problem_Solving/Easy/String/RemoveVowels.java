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

    public static class NonRepeatingCharacter {

        public static char returnFirstUniqueChar(String s){

            for(int i=0;i<s.length();i++){
                boolean isUnique = true;
                for(int j=0;j<s.length();j++){
                    if(s.charAt(i)==s.charAt(j) && i!=j){
                        isUnique = false;
                        break;
                    }
                }
                if(isUnique){
                    return s.charAt(i);

                }
            }
            return '@';
        }
        public static void main(String[] args) {
            String s = "abdccefadbef";
            char ch = returnFirstUniqueChar(s);
            System.out.println(ch);

        }
    }
}

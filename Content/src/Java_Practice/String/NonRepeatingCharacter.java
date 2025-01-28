package Java_Practice.String;

public class NonRepeatingCharacter {

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

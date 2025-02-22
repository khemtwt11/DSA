package DSA.Problem_Solving.Easy.String;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"fnlower","flow","frlowwht"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) return strs[0];
        String temp = strs[0];
        String res = "";

        for (int i = 0; i < temp.length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() > i && temp.charAt(i) != strs[j].charAt(i)) {
                    return res;
                }

                if (strs[j].length() - 1 < i) {
                    return res;
                }
            }
            res += temp.charAt(i);

        }
        return res;
    }
}

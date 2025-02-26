package DSA.Problem_Solving.Easy.Maths;

public class AddToBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("100","111"));
    }
    static String addBinary(String a, String b) {
        StringBuilder s = new StringBuilder();
        int aLength = a.length() - 1;
        int bLength = b.length() - 1;
        int carry = 0;

        while (aLength >= 0 || bLength >= 0 || carry > 0) {
            int sum = carry;

            if (aLength >= 0) {
                sum += a.charAt(aLength) - '0';
                aLength--;
            }

            if (bLength >= 0) {
                sum += b.charAt(bLength) - '0';
                bLength--;
            }

            s.append(sum % 2);
            carry = sum / 2;
        }

        return s.reverse().toString();
    }
}

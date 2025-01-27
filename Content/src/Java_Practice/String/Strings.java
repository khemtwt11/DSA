package Java_Practice.String;

public class Strings {
    // Create string
    public static void main(String[] args) {
        String s1 = "Gaurav"; // stored inside string pool, if a string already exist it refrence it without creating a new string
        String s4 = "Gaurav"; // memory efficient as duplicate strings aren't created but refrenced

        String s2 = new String("Saurav"); // create new object every time in heap outside of string pool every time even if the content is same
        String s3 = new String("Saurav");


        System.out.println(s2==s3); // false (different objects)
        System.out.println(s1==s4); // true (same refrence)
        System.out.println(s1==s3); // false (pool vs heap)
        System.out.println(s2.equals(s3)); // true (check content)


        System.out.println(s1.indexOf("a"));

    }

}

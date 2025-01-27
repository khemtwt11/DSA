package Java_Practice.StringBuilder;

public class StringBuilders {
    public static void main(String[] args) {

        StringBuilder s = new StringBuilder("gaurav");
        System.out.println(s.length());
        System.out.println(s.capacity()); // default capacity is 16 chars + "gaurav"
        s.ensureCapacity(180);
        System.out.println(s.capacity()); // whatever capacity is defined by default it's 16
        s.trimToSize(); // trim to actual char size defined while creating StringBuilder

        System.out.println(s.capacity());
        System.out.println(s.indexOf("a")); // string literal
    }
}

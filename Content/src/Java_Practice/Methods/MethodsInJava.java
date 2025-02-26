package Java_Practice.Methods;

import java.util.Scanner;

public class MethodsInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String personalised = myGreet(sc.next());
        System.out.println(personalised);
    }

     static String myGreet(String s) {
        return "Hello, "+s;
    }


}

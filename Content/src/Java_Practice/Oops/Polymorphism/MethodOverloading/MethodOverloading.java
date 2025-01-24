package Java_Practice.Oops.Polymorphism.MethodOverloading;
// same method name declared with different parameters or data types
public class MethodOverloading{
    public static int add(int a){
        return a*a;
    }

    public static int add(String name){
        return 0;
    }

    public static int add(double num){
        return (int) (num*8);
    }


    public static void main(String[] args) {
        System.out.println(add(23));
        System.out.println(add("gaurav"));
        System.out.println(add(188.9));

    }
}
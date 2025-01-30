package Java_Practice.String;
import java.lang.String;
import java.util.Arrays;
// chars are represented as 16-bit(2byte). This allows java to support different type of symbols
/*
The difference between StringBuffer and StringBuilder is that the former guarantees thread safety.
In a single-threaded environment, StringBuilder is more efficient.
 */
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


        System.out.println(s1.indexOf("a")); // find index of a char in the string
        System.out.println("GAurav".charAt(3)); // find character at the index
        System.out.println("valueOf".length()); // check the length of array
        System.out.println("Gaurav"=="Gaurav");
        System.out.println(new String("Gaurav") == new String("Gaurav")); // creates two different objects
        System.out.println(new String("Gaurav").equals(new String("Gaurav"))); // compare strings
        System.out.println(Arrays.toString("Gaurav".split(""))); //





        System.out.println((char)('E'-'A'+'a')); // 69-65+97 = 101

        System.out.println(Arrays.toString("man".split("")).length()); // 9
        System.out.println(Arrays.toString("Gaurav".split("")).length()); //18


//        String s = "Gaurav"; // can't iterate directly on string how we do with js
//        for (int i=0;i<s.length();i++){
//            System.out.println(s[i]);
//        }

        String[] chars = "Gaurav".split(""); // split() creates an array of string, each character also would be of type string
        for (String aChar : chars) {
            System.out.println(aChar);
        }

        System.out.println("Gaurav".contains("aur")); // check if a substring is a part of the main string
        System.out.println("".isEmpty()); // check if a string is empty or not

        System.out.println("gaurav".concat(" sharma")); // would create a new object
        System.out.println('A'==65); // implicit conversion
        System.out.println((int)'A'); // 65  conversion to their unicode number
        String[] rs = "Gaurav Sharma".split(" ");
        StringBuilder ss  = new StringBuilder();

        for(int i=0;i<rs.length;i++){
            ss.append(rs[i]);
        }
        System.out.println(ss);

        System.out.println("Gaurav Sh arma ".replaceAll(" ","")); // replace white spaces from the string
    }

    static{
        String[] s = "Gaurav".split(""); // declaration can be outside but initialization can't happen to prevent this behaviour we can have the code scoped with static block
        for (String aChar : s) {
            System.out.println(aChar);
        }
    }

    char[] ch  = "Gaurav".toCharArray(); // Only declaration is allowed
    String[] s = {"gaurav","saurav"};

}


/*
bit and byte are fundamental unit of data in computing and digital systems.
bit is either 0(represents false/off) and 1(on/true)
byte is a group of 8 bits randing from 0 to 255
*/
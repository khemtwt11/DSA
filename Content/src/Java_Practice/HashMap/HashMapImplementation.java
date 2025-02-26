package Java_Practice.HashMap;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
/*
 HashMap is a data-structure that stores key-value pairs and uses a hashing technique to store the elements. It's like a dictionary

 Hashmap allows for efficient retrieval, insertion and removal with average of O(1)

 Not ordered : Hashmap doesn't preserve order which means it the order in which elements are added to the map is not preserved.

 */

public class HashMapImplementation {
    public static void main(String[] args) {
        HashMap<Character,Integer>  hm= new HashMap<>();
        hm.put('a',1); // to add or replace a value of a key
        System.out.println(hm.get("hm")); // get the value of the key stored in HashMap
        // hm.clear();  clear the whole HashMap
        hm.put('b',2);
        hm.remove('b'); // remove a particular key-value pair
        System.out.println(hm.containsKey('a')); // returns true if key is present otherwise false
        System.out.println(hm);
        System.out.println(hm.containsValue(1)); // contains true if a value is present
        hm.put('b',hm.get('b')!=null ? hm.get('b')+1 : 0);

        // Iterate a hashmap if index is also required
//        int index = 0;
//        for(Map.Entry<Character,Integer> h : hm.entrySet()){
//            System.out.println(h.getKey()+" "+ h.getValue()+" "+index);
//            index++;
//
//        }


        // Iteration without hashmap
//        hm.forEach((key,value)-> System.out.println(key+" "+value));

    }
}

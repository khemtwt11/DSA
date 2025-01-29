package Java_Practice.HashMap;

import java.util.HashMap;
import java.util.Map;
public class StringWithHashmap {
    public static void main(String[] args) {
        String s = "racecar";
        HashMap<Character,Integer> hm = new HashMap<>();

        // setup hashmap to find character frequency of a string
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        hm.compute('a',(key,value)->value+10);

        // traversing through array
        int index = 0;
        for(Map.Entry<Character,Integer> hmEntry : hm.entrySet()){
            System.out.println(hmEntry.getKey()+" "+hmEntry.getValue()+" "+index);
            index++;
        }
    }
}

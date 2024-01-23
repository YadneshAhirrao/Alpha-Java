package Alpha.Data_Structure.Questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Leetcode {
    public static void main(String[] args) {
        System.out.println(checkStrings("abcdba", "cabdab"));
    }

    public static boolean checkStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        
        Map<Character, Integer> oddmap = new HashMap<>();
        Map<Character, Integer> evenmap = new HashMap<>();
        
        for (int i = 0; i < s1.length(); i++)
            if (i % 2 == 0) {
                evenmap.put(s1.charAt(i), evenmap.getOrDefault(s1.charAt(i), 0) + 1);
            }
            else {
                oddmap.put(s1.charAt(i), oddmap.getOrDefault(s1.charAt(i), 0) + 1);
            }

        for (int i = 0; i < s1.length(); i++) {
            char temp = s2.charAt(i);
            if (i % 2 != 0) {
               if (oddmap.containsKey(temp)) {
                    oddmap.put(temp, oddmap.get(temp) - 1);
                    if (oddmap.get(temp) == 0) {
                        oddmap.remove(temp);
                    }                  
                }
                else {
                    return false;
                }
            }
            else {
                 if (evenmap.containsKey(temp)) {
                    evenmap.put(temp, evenmap.get(temp) - 1);
                    if (evenmap.get(temp) == 0){
                        evenmap.remove(temp); 
                    }                 
                }
                else {
                    return false;
                }
            }
            
        }
        
        return true;
    }
}



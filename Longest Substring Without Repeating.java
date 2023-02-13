
package longest.substring.without.repeating;
import java.util.Collections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
public class LongestSubstringWithoutRepeating {
    pulic static int LongestSubstringWithoutRepeating(String args){
        int maxCount = 0;
        int i = 0 ;
        int j = 0;
        String s = " ";
        int strlen = s.length();
        
        Set<Character> st = new HashSet<>();
        
        while(i < strlen && j < strlen){
            if(!st.contains(s.charAt(j))){
                st.add(s.charAt(j));
                j++;
                maxCount = Math.max(maxCount, j-i);
            }else{
                st.remove(s.charAt(i));
                i++;
            }
        }
        return maxCount;
            
    }
 public static void main(String s[]){
     String str = "abcdabcdbb";
     int len = LongestSubstringWithoutRepeating(str);
     
     System.out.println("Length" + len);
 }   
}
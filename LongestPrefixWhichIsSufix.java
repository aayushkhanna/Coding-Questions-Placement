//Given a string s, find length of the longest prefix which is also suffix.The prefix and suffix should not overlap.
//Input : aabcdaabc
//Output : 4
//The string "aabc" is the longest prefix which is also suffix.

package longest.prefix.which.is.sufix;
import java.util.Scanner;
public class LongestPrefixWhichIsSufix {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String str = k.next();
        int length = str.length();
        int half = length/2;
        if(length<2){
            System.out.println("-1");
            System.exit(0);
        }
        for (int i = half;i>=0;i--){
            String prefix = str.substring(0,i);
            String suffix = str.substring(length-i,length);
            if(suffix.equals("") || prefix.equals("")){
            System.out.println("-1");
            System.exit(0);
        }
            if(suffix.equals(prefix)){
                System.out.println(suffix.length());
                break;
            }
        }
    }
    
}

// Input format :- 134567
// So in the input number 1,3,5,7 are odd. Square each digits we will get 192549 Now print firt four digits as output i.e. 192549
//Now print first four digits as output i.e. 1925
// If in case not possible then print then print -1
// Input :- 222222
//Output :- -1
package otp.generator;
import java.util.Scanner;
public class OtpGenerator {
    public static void main(String[] args) {
    Scanner k = new Scanner(System.in);
    String input = k.next();
    StringBuilder sb = new StringBuilder();
    int sq = 0;
    for (int i = 0; i<input.length();i++){
        char ch = input.charAt(i);
        int no = Integer.parseInt(String.valueOf(ch));
        
        if(no %2!=0){
            sq = no*no;
            sb.append(String.valueOf(sq));
        }
    }
    String str = sb.toString();
    if(str.length()<4){
        System.out.println("-1");
    }
    else{
        String output = str.substring(0,4);
        System.out.println(output);
    }
    }
    
}

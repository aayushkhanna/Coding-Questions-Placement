// Take input from user in the given format (concict of name and code. Find max digit code which is less or equal to the length of String and put that
//char in final String if there is no any digit found which not satisfy the condition that simply put 'X'.
// #input : Abhishek:34848
// #input : Mayur:4739
// #input : Friends:2949
// #input : Yeah : 9889
// Output : kueX
package passwordgenerator;
import java.util.Scanner;
public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String input = k.next();
        String str[] = input.split(",");
        String password = "";
        for(String obj:str){
            String ar [] = obj.split(":");
            String empName = ar[0];
            String empNumber = ar[1];
            
            int Namelen = empName.length();
            int Numberlen = empNumber.length();
            
            int num = 1;
            for(int i = 0 ; i<Numberlen;i++){
                int digit = Integer.parseInt(String.valueOf(empNumber.charAt(i)));
                if(digit<=Namelen  && digit>num);
                num = digit;
            }
            if(num == -1)
                password+="X";
            else
                password+=String.valueOf(empName.charAt(num-1));
            

        }
        System.out.println(password);
    }
    
}
     


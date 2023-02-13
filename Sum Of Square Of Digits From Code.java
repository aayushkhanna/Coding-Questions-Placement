//Take input from the user in the given format(consist of name and code).
//Find sum of square of digits from code. If the sum of quares of digits of the code rae:-
//EVEN :- Then add the last 2 characters in the beginning
//ODD :- Then add first character at the end
//Input :- abcd:1234;bcdgfhf:127836;sdjks:1245
//Output:- cdab cdgfhfd kssdj
package sum.of.square.of.digits.from.code;
import java.util.ArrayList;
import java.util.Scanner;
public class SumOfSquareOfDigitsFromCode {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String input = k.nextLine();
        for(String combo:input.split(",")){
            String[]inner = combo.split(":");
            System.out.println(makeOutput(inner[0],inner[1])+"");
        }
    }
    public static String makeOutput(String name,String code){
        String output="";
        if(willbeEven(code)){
            String pre = name.substring(0,name.length()-2);
            String post = name.substring(name.length()-2,name.length());
            
        }
        else{
            String pre = name.substring(0,1);
            String post = name.substring(1,name.length());
            output = post+pre;
        }
        return output;
    }
    public static boolean willbeEven(String code){
        int sum = 0;
        for(String i : code.split("")){
            switch(Integer.parseInt(i)){
                case 1:
                case 3:
                case 5:
                case 7:
                case 9:
                    sum = sum+1;
                    break;
            }
        }
        return (sum%2==0);
    }
    
}

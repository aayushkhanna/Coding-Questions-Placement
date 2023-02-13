//Given a list of number seperated with comma
//The numbers 5 and 8 present in the list. Assume that 8 always comes after 5.
//case1:- num1->Add all numbers which do not lie between 5 and 8 in the Input List.
//case2:- num2->Numbers formed by concatenating all numbers from 5 to 8 in the list.
//Output : - Sum 0f num1 anx num2
//Example :- 3,2,6,5,1,4,8,9
//num1:- 3+2+6+9 = 20
//num2:- 5148
//output = 5148+20 = 5168
package problemfiveeight;
import java.util.Scanner;
public class Problemfiveeight {
    public static void main(String[] args) {
    Scanner k = new Scanner(System.in);
    String input = k.next();
    String in = input.replace(",","");
    int flag = 0;
    StringBuilder sb = new StringBuilder(); //the string will be converted into integer 
    int sum = 0 ;
    for(int i =0;i<in.length();i++){
        char ch = in.charAt(i);
        
        if(ch == '5')
        flag = 1;
        
        if(flag == 0){
            int n = Integer.parseInt(String.valueOf(ch));
            sum = sum+n;
        }
        else{
            sb.append(ch);
        }
        if(ch == '8')
            flag = 0;
    }
    int one = Integer.parseInt(sb.toString());
    System.out.println(sum+one);
            }
    }
    


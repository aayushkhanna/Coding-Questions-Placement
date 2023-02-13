// Program to reverse a string after removing duplicates.
//Input :- infosys
//Output :- ysofni
//input :- google
//Output :- elog
package reverse.a.string.after.removing.duplicates;
import java.util.Scanner;
public class ReverseAStringAfterRemovingDuplicates {
    public static void main(String[] args) {
      String input = new Scanner(System.in).nextLine();
      String output = "";
      for(String c:input.split("")){
          if(!output.contains(c)){
              output = c+output;
          }
      }
     System.out.println(output);
    }
    
}

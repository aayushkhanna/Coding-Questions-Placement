
package valid.nested.brackets;
import java.util.*;
public class ValidNestedBrackets {
    public static ArrayList<String> STACK = new ArrayList<>();
    public static int ITERATIONS = 0;
    public static void push(String s){
        STACK.add(s);
    }
    
   public static String peek(){
       if(STACK.isEmpty())
           exit();
       return STACK.get(STACK.size()-1);
   }
   public static String pop(){
       String ch = STACK.remove(STACK.size()-1);
       return ch;
   }
   public static void exit(){
       System.out.println(ITERATIONS);
       System.exit(0);
   }
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String input = k.nextLine();
        for(String s:input.split("")){
            ITERATIONS++;
         switch(s){
             case "(":
             case "[":
             case "{":
                 push(s);
                 break;
             case ")":
                 if(peek().equals("("))
                     pop();
                 else
                     exit();
                     break;
             case "]":
                 if(peek().equals("{"))
                     pop();
                 else
                     exit();
                     break;
             case "}":
                 if(peek().equals("}"))
                     pop();
                 else
                     exit();                      
         }
        }
    }
    
}

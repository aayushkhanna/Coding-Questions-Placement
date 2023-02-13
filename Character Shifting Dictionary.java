package character.shifting.dictionary;
import java.util.ArrayList;
import java.util.Scanner;
public class CharacterShiftingDictionary {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String input = k.nextLine();
        for(String combo: input.split(",")){
            String[]inner = combo.split(":");
//            System.out.println(makeOutput(inner[0],inner[1])+"");
            
        }
    }
    public static String makeOutput(String name , String code){
        String output = "";
        if(willBeEven(code)){
            String pre = name.substring(0,name.length()-2);
            String post = name.substring(name.length()-2,name.length());
            output = post + pre;
        }
        else{
            String pre = name.substring(0,1);
            String post = name.substring(1,name.length());
            output = post+pre;
        }
        return output;
    }
    public static boolean willBeEven(String code){
        int sum = 0;
        for(String i : code.split("")){
            switch(Integer.parseInt(i)){
                case 1:
                case 3:
                case 5:
                case 7:
                case 9:
                    sum= sum + 1;
                    break;
            }
        }
        return(sum%2==0);
    }
    
}

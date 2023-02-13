//A string which is a mixture of letters, numeber and special characters from which produce the largest even number from the available digit after removing the duplicates digits.
//If an even number did not produce then return -1
//Input:- infosys@337
//output :- -1
//Input:- Hello#81@21349
//Output:- 984312
package largestevennumber;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.HashSet;
public class LargestEvenNumber {
    public static void main(String[] args) {
      Scanner k = new Scanner(System.in);
      String input = k.next();
      
      input = input.replaceAll("[A-Za-z","");
      input = input.replaceAll("\\W","");
      
      HashSet<Integer> hs = new HashSet<>();  //to remove duplicate elements
      for(int i = 0; i<input.length();i++){
        hs.add(Integer.parseInt(String.valueOf(input.charAt(i))));
        
        ArrayList<Integer> list = new ArrayList<>(hs); // copied hashtag to arraylist
        Collections.sort(list,Collections.reverseOrder()); //sort the list in reverse
        
        boolean noEven = true;
        int len = list.size();
        for(i = len-1;i>0;i--){
            if(list.get(i)%2==0){
                list.add(list.get(i));
                list.remove(i);
                noEven = false;
                break;
                
            }
        }
        if(noEven){
            System.out.println("-1");
        }
        else{
            for(int elem:list){
                System.out.println(elem);
            }
        }
    }
 
    
    }}

//Take  a number 'N' and an arraywh from user as given below:
//N = 2  Array = 1,2,3,3,4,4
//Find the least number of unique elements after deleting N numbers of elements from the array
//Input :- 2 
//1,2,3,3,4,4
//Output : 2
package unique.elements.after.deleting.x.elements;
import java.util.HashSet;
import java.util.Scanner;
public class UniqueElementsAfterDeletingXElements {
public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    String arr = kb.next();
    String strArr[]=arr.split(",");
    int lengthOfArray = strArr.length;
    HashSet<Integer> hs = new HashSet<>();
    
    for(int i = 0; i<lengthOfArray;i++){
        hs.add(Integer.parseInt(strArr[i]));
    }
    int unique = hs.size();
    System.out.println(unique-n);
    }
}

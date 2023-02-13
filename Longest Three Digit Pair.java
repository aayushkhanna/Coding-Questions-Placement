//Input :- 1,2,1 //inarr
//Output:- 211,3
//Explaination :- for input inarr all possible unique 3 digit number combinations are :- 121,112,211
//The maximu  3 digit number 211.The total number of unique combinations of 3 digit number that can be formed is 3.Printing 211 followed by 3 seperated by ','(comma).
//Hence the output is 211,3
//Input:- 1,2,1,4 //inarr
//Output:- 421,12
//Explaination :- For input inarr all possible unique 3 digit number combinations are:
//121,411,124,214,114,142,141,211,421,112,241,412
//The maximum 3 digit number is 421.The number of unique combinations of 3 digit number that can be formed is 12.Printing 421 followed by 12 seperated by ',' (comma).
//Hence the output is 421,12
package longest.three.digit.pair;
import java.util.*;
public class LongestThreeDigitPair {    
    public static int factorial(int n){
        int fact = 1;
        for(int i = 1 ; i<= n;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) throws java.lang.Exception {
        Scanner kb = new Scanner(System.in);
        String input = kb.nextLine();
        String inArr[]=input.split(",");
        int size = inArr.length;
        int arr[] = new int(size);
        int max = -1;
        for(int i = 0;i<size;i++)
        {
        arr[i] = Integer.parseInt(inArr[i]);
        if(max<arr[i]){
            max = arr[i];
        }
    }
    int frequency[] = new int[max + 1];
    for(int ele:arr){
        frequency[ele]++;
    }
    int unique = 0;
    int duplicate = 0;
    int pair = 0;
    for(int frq:frequency){
        if(frq>=2){
            duplicate++;
            if(frq>=3){
                pair++;
            }
            else if(frq==1)
                unique++;
        }
        Arrays.sort(arr);
        String biggestNumber = arr[size-1]+""+arr[size-2]+""+arr[size-3];
        
        if(unique==0 && duplicate == 1){
            System.out.println(biggestNumber+","+1);
        }
        else if(unique ==1 && duplicate==1){
            System.out.println(biggestNumber+","+(pair+3));
        }
        else if(unique ==0 && duplicate==2){
            System.out.println(biggestNumber+","+(pair+6));
        }
        else
        {
            int upper = factorial(unique+duplicate);
            int lower = factorial((unique+duplicate)-3);
            pair += upper/lower;
            pair += (unique*duplicate)*3;
            if(duplicate>=2){
                upper = factorial(duplicate);
                lower = factorial(duplicate-2);
                int p = upper/lower;
                pair += (p*3);
            }
            System.out.println(biggestNumber+","+pair);
        }
    }
}
}

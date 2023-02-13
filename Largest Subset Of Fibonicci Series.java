//Given an array with positive number(comma seperated)the task is that we find largest subset from array that contain elements which are fibonacci numbers
//If more than two elements exist then print its length else print -1
//Input:-   8 
//3,2,5,8,9,10,11
//Output:- 5(2,3,5,8,11)
//Input:-  6 
//2,6,3,5,8,9
//Output:- 4([2,3,5,8])
package largest.subset.of.fibonicci.series;
import java.util.*;
public class LargestSubsetOfFibonicciSeries {
        // Prints largest subset of an array whose 
    // all elements are fibonacci numbers 
    public static void findFibSubset(Integer[] x) 
    { 
        Integer max = Collections.max(Arrays.asList(x)); 
        List<Integer> fib = new ArrayList<Integer>();  
        List<Integer> result = new ArrayList<Integer>(); 
          
        // Generate all Fibonacci numbers  
        // till max and store them 
        Integer a = 0; 
        Integer b = 1; 
        while (b < max){ 
            Integer c = a + b; 
            a=b; 
            b=c; 
            fib.add(c); 
        } 
        
        // Now iterate through all numbers and 
        // quickly check for Fibonacci 
        for (int i = 0; i < x.length; i++){ 
        if(fib.contains(x[i])){ 
            result.add(x[i]);  
        }      
        } 
        System.out.println(result); 
    } 
       
    // Driver code 
    public static void main(String args[]) 
    { 
        Integer[] a = {3,2,5,8,9,10,11};  
        findFibSubset(a);
    } 
} 
  
// This code is contributed by prag93 
 
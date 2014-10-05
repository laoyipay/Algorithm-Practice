
package Leetcode;
import java.util.*;
/**
 *
 * @author Yi
 */
public class TwoSum {
    
    //O(n^2)
    public static int[] twoSum1(int[] numbers, int target) {

        int[] result = new int[2];

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] + numbers[j] == target) {
                    result[0] = i + 1;
                    result[1] = j + 1;
                 }

            }

        }
        return result;
    }
   
    
   //O(n)
   public static int[] twoSum2(int[] numbers,int target){
       HashMap<Integer,Integer> map = new HashMap<>();
       int[] result = new int[2];
       
       for (int i = 0; i < numbers.length; i++){
           if (map.containsKey(numbers[i])){
               int index = map.get(numbers[i]);
               result[0] = index + 1;
               result[1] = i +1;
           
           } else {
               map.put(target - numbers[i],i);
           }
      }
       return result;
   
   }
    
    
    public static void main(String[] args){
        int[] numbers = {3,5,7,2,1,2,5,7,38,8,2,5};
        int target = 40;
        
        int[] result = twoSum2(numbers, target);
        
        for(int n:result){
        
            System.out.println(n);
            
        }
    }

}

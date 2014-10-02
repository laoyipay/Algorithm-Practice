/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;

/**
 *
 * @author Yi
 */
public class Prime {
    
    public static boolean isPrime(int n) {
        
        if ( n <= 1){
            return false;
        }
        
        //小心Math.sqrt（n) + 1 还有(int)
        for ( int i = 2; i < (int)Math.sqrt(n) + 1; i++){
            
            if ( n % i == 0){
                return false;
            }
        }
        
        return true;
    
    }
    
    public static String primeBetween(int A,int B){
        
        String result = "";
        
        for (int i = A; i <= B; i++){
            
            if ( isPrime(i) ){
                 result += " " + i;
            }
        
        }
        
        return result;
    
    }
    
    public static void main(String[] args){
        
        int number = 2;
        boolean result = isPrime(number);
        System.out.print("Is " + number + " a prime number? Answer: " + result);
       
        
       System.out.print(primeBetween(0,100));
    }
    
}

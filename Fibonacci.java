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
public class Fibonacci {
    
    //Terrible Recursion function
    public static int Fibonacci(int n){
        if ( n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }
    
    //O(0

    public static int Fibonacci2(int n){
        if( n <= 2){
            return 1;
        }
        int i = 3;
        int a = 1;
        int b = 1;
        int c = 0;
        while ( i <= n ){
            c = a + b;
            a = b;
            b = c;
            i++;
        }
        return c;
    }
    
    public static void main(String[] args) {
        int number = 40;
        int result = Fibonacci2(number);
        System.out.print(result);
    }
}

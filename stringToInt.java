/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leetcode;

/**
 *
 * @author Yi
 */
public class stringToInt {

    public static int stringToInt1(String str) {
        if (str == null || str.length() < 1) {
            return 0;
        }
        //eliminate white space
        str = str.trim();

        char sign = '+';
        int i = 0;

        //Check sign
        if (str.charAt(0) == '-') {
            sign = '-';
            i++;
        } else if (str.charAt(0) == '+') {
            i++;
        }

        double result = 0;

        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {

            result = result * 10 + (str.charAt(i) - '0');
            i++;

        }

        if (sign == '-') {
            result = -result;
        }
        
        //max and min
        if ( result > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        
        if ( result < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        
        }

        return (int) result;

    }
    
    public static void main(String[] args){
        String number = "2014";
        int result = stringToInt1(number);
        System.out.print(result);
    
    }

}

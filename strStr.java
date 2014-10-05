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
public class strStr {
    
    public static String strStr(String haystack,String needle){
        if (haystack == null || needle == null){
            return null;
        }
        
        int i,j;
        
        for ( i = 0; i < haystack.length() - needle.length() + 1; i++ ){
            
            for ( j = 0; j < needle.length() ; j++ ){
                if (haystack.charAt( i + j ) != needle.charAt(j)){
                    break;
                }
            }
            if ( needle.length() == j){
                return haystack.substring(i);
            }
        }
        return null;
    
    }
      
     public static void main(String[] args){
         String haystack = "Facebook";
         String needle = "book";
         
         String result = strStr(haystack,needle);
         
         System.out.print(result);
     
     }
    
}

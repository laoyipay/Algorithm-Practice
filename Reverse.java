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
public class Reverse {
    
    public static String reverse(String word){
        
        StringBuilder strBuilder = new StringBuilder();
        char[] strChars = word.toCharArray();
        
     
        for (int i = word.length()-1; i >=0; i--){
            
            strBuilder.append(strChars[i]);
        }
        return strBuilder.toString();
       
    }

    public static String reverse2(String str){
        StringBuilder sb = new StringBuilder();
        for ( int i = str.length()-1; i>=0; i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    
     public static void main(String[] args) {
         String str= "Drexel";
         String result = reverse2(str);
         System.out.print(result);
         
     }
    
}

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
public class SplitString {

    public static String splitBySpace(String word) {
        String word2 = "";
        for (int i = 0; i < word.length(); i++) {
            word2 += word.substring(i, i + 1) + " ";
        }
        return word2;
    }
    
    public static String split2(String word){
        String newString = "";
        for ( int i = 0; i < word.length(); i++){
            newString += word.substring(i, i+1) + " ";
        }
        return newString;
    }
    
    public static String split3(String word){
        
        StringBuilder strBuilder = new StringBuilder();
        char[] strChars = word.toCharArray();
        for (int i=0; i < word.length();i++){
            
            strBuilder.append(strChars[i]+" ");
            
        }
        
        return strBuilder.toString();
    
    }
    
    public static void main(String[] args){
    
        String word = "Drexel";
        System.out.print(split3(word));
        
    }

}

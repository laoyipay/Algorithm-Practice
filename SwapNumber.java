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
public class SwapNumber {
    
    public static void swap(int A, int B){
        System.out.println ("Before swap: A = "+ A + " B = "+ B );
        A = A + B;
        B = A - B;
        A = A - B;
        System.out.println ("After swap: A = "+ A + " B = "+ B );
    }
    
    public static void main(String[] args){
        swap(5,10);
    }
    
}

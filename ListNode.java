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
public class ListNode {
    public int val;
    public ListNode next;
    
    public ListNode(int d){
        val = d;
        next = null;
    }
    
    public void displayLink(){
          System.out.print(val);
    }
    
}

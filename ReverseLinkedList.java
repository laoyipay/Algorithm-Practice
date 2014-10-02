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
public class ReverseLinkedList {
    
    public static LinkedList reverseSingly(LinkedList head){
        if (head != null){
            LinkedList prev = null;
            while (head.next != null) {
                LinkedList next = head.next; 
                head.next = prev;
                prev = head;
                head = next;
            }
            head.next = prev;            
        }
        return head;
    }
    
    
}

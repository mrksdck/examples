package com.example;
/**
 * single linked list
 */
public class LinkedList{

    OneLinkNode head;

    public boolean isEmpty() {
        return head == null;
    }

    public OneLinkNode get(int index) {
        OneLinkNode node = head;
        while(index > 0 && node != null){
            node = node.getSuccessor();
            index--;
        }
        return node;
    }

    public void add(OneLinkNode newNode) {
        if(head == null){
            head = newNode;
        }else {
            newNode.setSuccessor(head);
            head = newNode;
        }
    }

    public OneLinkNode head() {
        return head;
    }
}

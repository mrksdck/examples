package com.example;
/**
 * * Node with predecessor and successor
 */
public class OneLinkNode {

    private String value;
    private OneLinkNode successor;

    public OneLinkNode(String value){
        this.value = value;
    }

    public OneLinkNode getSuccessor() {
        return successor;
    }

    public String getValue() {
        return value;
    }

    public void setSuccessor(OneLinkNode successor) {
        this.successor = successor;
    }
}

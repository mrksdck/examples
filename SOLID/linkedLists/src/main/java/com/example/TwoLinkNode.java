package com.example;
/**
 * Node with predecessor and successor
 */
public class TwoLinkNode extends OneLinkNode {
    private TwoLinkNode predecessor;

    public TwoLinkNode(String value) {
        super(value);
    }

    public TwoLinkNode getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(TwoLinkNode predecessor) {
        this.predecessor = predecessor;
    }
}

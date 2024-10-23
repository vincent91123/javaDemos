package com.panpan.Package;

/**
 * @author panpan
 * @create 2024-08-30-上午 11:17
 */
public class Node {
    private Node prefix;
    private Object value;
    private Node next;

    public Node getPrefix() {
        return prefix;
    }

    public void setPrefix(Node prefix) {
        this.prefix = prefix;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "prefix=" + prefix +
                ", value=" + value +
                ", next=" + next +
                '}';
    }
}

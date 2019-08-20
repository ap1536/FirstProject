package com.company;

public class Linkedlist {
    private Node head;

    public void addAtHead(int i) {
        Node newNode = new Node(i);
        newNode.setNextNode(this.head);
        this.head = newNode;
    }

    @Override
    public String toString(){
        String result = "{";
        Node current = this.head;

        while (current != null){
            result += current.toString() + ", ";
            current = current.getNextNode();
        }
        result += "}";
        return  result;

    }
}

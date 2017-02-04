package com.example.linkedlist;
import java.util.ArrayList;

public class LinkedList {
    protected LinkNode first;
    protected LinkNode last;

    // Constructor
    public LinkedList() {
        first = null;
        last = null;
    }

    public void insert(LinkNode newNode){
        if( LinkedListIsEmpty() ) {
            first = newNode;
            ok();
        } else if ( LinkedListHasOneNode() ) {
            last = newNode;
            first.next = last;
            ok();
        } else {
            last.next = newNode;
            last = newNode;
            ok();
        }
    }

    public void insert(LinkNode newNode, LinkNode start){
        try {
            LinkNode current = first;

            while(current.value != start.value) {
                current = current.next;
            }

            newNode.next = current.next;

            if(current.next == null) {
                last = newNode;
            }

            current.next = newNode;

            ok();
        } catch (Exception e) {
            fail("So you think you're Bishop Fox?");
        }
    }

    public void insertFirst(LinkNode newNode){
        newNode.next = first;
        first = newNode;
        ok();
    }

    public void insertLast(LinkNode newNode){
        LinkNode current = last;
        current.next = newNode;
        last = newNode;
        ok();
    }

    public void removeFirst(){
        first = first.next;
        ok();
    }

    public void removeLast(){
       LinkNode current = first;

       while (current.next != last){
           current = current.next;
       }

       current.next.next = null;
       ok();
    }

    public void displayAll(){
        ArrayList list = new ArrayList<Integer>();

        if(LinkedListIsEmpty()){ System.out.println("Empty"); }

        LinkNode current = first;
        list.add(current.value);


        while(current.hasNext()){
            current = current.next;
            list.add(current.value);
        }

        System.out.println(list.toString());
    }


    private Boolean LinkedListIsEmpty() {
        return first == null;
    }

    private Boolean LinkedListHasOneNode(){
        return first != null && last == null;
    }

    private void ok(){
        System.out.println("OK");
    }

    private void fail(String msg){
        throw new java.lang.Error(msg);
    }
}

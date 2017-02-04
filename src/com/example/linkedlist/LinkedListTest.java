package com.example.linkedlist;

/**
 * Created by louishoang on 2/3/17.
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkNode node1 = new LinkNode(1);
        LinkNode node2 = new LinkNode(2);
        LinkNode node3 = new LinkNode(3);
        LinkNode node4 = new LinkNode(4);
        LinkNode node5 = new LinkNode(5);
        LinkNode node6 = new LinkNode(6);


        System.out.println("Insert when LinkedList is empty");

        LinkedList linkedList = new LinkedList();
        linkedList.insert(node1);
        linkedList.displayAll();


        System.out.println("Insert when LinkedList has one item");
        linkedList.insert(node3);
        linkedList.displayAll();


        System.out.println("Insert when LinkedList has two or more items");
        linkedList.insert(node5);
        linkedList.displayAll();


        System.out.println("Insert in the MIDDLE of LinkedList");
        linkedList.insert(node4, node3);
        linkedList.displayAll();


        System.out.println("Insert to the last place of LinkedList using insert()");
        linkedList.insert(node6, node5);
        linkedList.displayAll();


        System.out.println("Insert to the last place of LinkedList using insertLast");
        linkedList.insertLast(new LinkNode(7));
        linkedList.displayAll();


        System.out.println("Remove last Node");
        linkedList.removeLast();
        linkedList.displayAll();


        System.out.println("Insert to the first place of LinkedList");
        linkedList.insertFirst(new LinkNode(0));
        linkedList.displayAll();


        System.out.println("Remove first Node");
        linkedList.removeFirst();
        linkedList.displayAll();
    }
}

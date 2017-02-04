package com.example.linkedlist;

/**
 * Created by louishoang on 2/3/17.
 */
public class LinkNode {
    protected Integer value;
    protected LinkNode next;

    public LinkNode(Integer num){
        value = num;
    }

    public Boolean hasNext(){
        return next != null;
    }
}

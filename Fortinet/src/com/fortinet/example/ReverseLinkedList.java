package com.fortinet.example;

public class ReverseLinkedList {

	public Node reverseList(Node head) {
	    if(head==null||head.next==null)
	        return head;
	 
	    Node t1 = head;
	    Node t2 = t1.next;
	 
	    head.next = null;
	    while(t1!=null&& t2!=null){
	        Node t = t2.next;
	        t2.next = t1;
	        t1 = t2;
	        t2 = t;
	    }
	    return t1;
	}
}

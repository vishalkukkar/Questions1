package com.fortinet.example;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.fortinet.example.Node;
import com.fortinet.example.ReverseLinkedList;

public class TestRunner {

	ReverseLinkedList myClass = new ReverseLinkedList();

	@Test
	public void testReverseListNull() {

		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		Node result = myClass.reverseList(head);
		Assert.assertNotNull(result);

	}

	@Test
	public void testReverseListContent() {

		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);

		// create temp list
		Node temp = head;
		List<Integer> list = new ArrayList<Integer>();
		int count = 0;
		while (temp != null) {
			list.add(temp.val);
			temp = temp.next;
			count++;

		}
		Node result = myClass.reverseList(head);

		// compare data
		Boolean flag = true;
		while (result != null && head != null && count >= 0) {
			count--;
			if (list.get(count) != result.val) {
				flag = false;
				break;
			}
			result = result.next;
		}
		assertTrue(flag);
	}


	@Test
	public void testReverseListWithOneElement() {

		Node head = new Node(1);
		head.next = null;
		Node result = myClass.reverseList(head);
		Assert.assertNotNull(result);
		while (result != null) {
			assertEquals(result.val, 1);
			result = result.next;
		}
	}

	@Test
	public void testReverseListWithNull() {

		Node head = null;
		Node result = myClass.reverseList(head);
		Assert.assertNull(result);
	}
}

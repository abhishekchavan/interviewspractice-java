package com.abhishekchavan;

public class LinkedListMine {

	private LinkedNode head;

	public LinkedNode getHead() {
		return head;
	}

	public void setHead(LinkedNode head) {
		this.head = head;
	}

	public static class LinkedNode {

		private int value;

		private LinkedNode next;

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public LinkedNode getNext() {
			return next;
		}

		public void setNext(LinkedNode next) {
			this.next = next;
		}
	}

}

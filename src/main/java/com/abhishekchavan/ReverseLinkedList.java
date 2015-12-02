package com.abhishekchavan;

import com.abhishekchavan.LinkedListMine.LinkedNode;

public class ReverseLinkedList {

	public static void main(String[] args) {
		LinkedListMine list = new LinkedListMine();

		LinkedNode linkedNode1 = new LinkedNode();
		linkedNode1.setValue(10);

		LinkedNode linkedNode2 = new LinkedNode();
		linkedNode2.setValue(20);

		LinkedNode linkedNode3 = new LinkedNode();
		linkedNode3.setValue(30);

		list.setHead(linkedNode1);
		linkedNode1.setNext(linkedNode2);
		linkedNode2.setNext(linkedNode3);

		ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
		reverseLinkedList.reverseLinkedListIterative(list);

	}

	public void reverseLinkedListIterative(LinkedListMine list) {
		if (list.getHead() != null && list.getHead().getNext() != null) {

			LinkedNode first = list.getHead();

			LinkedNode second = first.getNext();

			LinkedNode third = second.getNext();

			first.setNext(null);
			second.setNext(first);

			if (third == null) {
				return;
			} else {
				LinkedNode currentNode = third;
				LinkedNode previousNode = second;

				while (currentNode != null) {
					LinkedNode secondNode = third.getNext();

					currentNode.setNext(previousNode);

					currentNode = secondNode;
					previousNode = currentNode;
				}

				list.setHead(previousNode);
			}

		}
	}

	public void reverseLinkedListRecursive(LinkedListMine list) {
		if (list.getHead() != null && list.getHead().getNext() != null) {

		}
	}

	public void reverseList(LinkedNode node, LinkedNode previousNode) {
		if (node != null) {
			LinkedNode nextNode = node.getNext();
			node.setNext(previousNode);
			reverseList(nextNode, node);
		}
	}

}

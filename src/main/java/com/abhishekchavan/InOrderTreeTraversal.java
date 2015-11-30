package com.abhishekchavan;

import java.util.Stack;

import com.abhishekchavan.Tree.Node;

/**
 * Tree Traversal Pre order. Left first, then see data element. and right then.
 * 
 * @author uchavab
 *
 */
public class InOrderTreeTraversal {

	public static void main(String[] args) {
		Node<Integer> node = new Node<>();

		Tree<Integer> tree = new Tree<>(node);

		InOrderTreeTraversal inOrderTreeTraversal = new InOrderTreeTraversal();

		inOrderTreeTraversal.traverseInOrder(tree.getRootNode());
	}

	public void preOrderTraversal() {

	}

	public void traverseInOrder(Node<Integer> rootNode) {
		if (rootNode != null) {
			traverseInOrder(rootNode.getLeftNode());
			System.out.println(rootNode.getValue());
			traverseInOrder(rootNode.getRightNode());
		}
	}

	public void iterativeInOrder(Node<Integer> rootNode) {
		Stack<Node<Integer>> stack = new Stack<>();
		Node<Integer> currentNode = rootNode;
		while (!stack.isEmpty() || currentNode != null) {
			if (currentNode != null) {
				stack.push(currentNode);
				currentNode = currentNode.getLeftNode();
			} else {
				currentNode = stack.pop();
				System.out.println(currentNode.getValue());
				currentNode = currentNode.getRightNode();
			}
		}
	}
}

package com.abhishekchavan;

import java.util.Stack;

import com.abhishekchavan.Tree.Node;

/**
 * Tree Traversal Post order. Left then and right then, then First see data
 * element.
 * 
 * @author uchavab
 *
 */
public class PostOrderTreeTraversal {

	public static void main(String[] args) {
		Node<Integer> node = new Node<>();

		Tree<Integer> tree = new Tree<>(node);

		PostOrderTreeTraversal postOrderTreeTraversal = new PostOrderTreeTraversal();

		postOrderTreeTraversal.traversePostOrder(tree.getRootNode());
	}

	public void postOrderTraversal() {

	}

	public void traversePostOrder(Node<Integer> rootNode) {
		if (rootNode != null) {
			traversePostOrder(rootNode.getLeftNode());
			traversePostOrder(rootNode.getRightNode());
			System.out.println(rootNode.getValue());
		}
	}

	public void iterativeInOrder(Node<Integer> rootNode) {
		Stack<Node<Integer>> stack = new Stack<>();
		Node<Integer> currentNode = rootNode;
		Node<Integer> lastnodevisited = null;
		while (!stack.isEmpty() || currentNode != null) {
			if (currentNode != null) {
				stack.push(currentNode);
				currentNode = currentNode.getLeftNode();
			} else {
				Node peekNode = stack.peek();
				if (peekNode.getRightNode() != null && lastnodevisited != peekNode.getRightNode()) {
					currentNode = peekNode.getRightNode();
				} else {
					System.out.println(currentNode.getValue());
					lastnodevisited = stack.pop();
				}

			}
		}
	}
}

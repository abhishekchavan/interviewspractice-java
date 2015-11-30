package com.abhishekchavan;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.abhishekchavan.Tree.Node;

/**
 * Tree Traversal Pre order. First see data element. Left then and right then.
 * 
 * @author uchavab
 *
 */
public class PreOrderTreeTraversal {

	public static void main(String[] args) {
		Node<Integer> node = new Node<>();

		Tree<Integer> tree = new Tree<>(node);

		PreOrderTreeTraversal preOrderTreeTraversal = new PreOrderTreeTraversal();

		preOrderTreeTraversal.traversePreOrder(tree.getRootNode());
	}

	public void preOrderTraversal() {

	}

	public void traversePreOrder(Node<Integer> rootNode) {
		if (rootNode != null) {
			System.out.println(rootNode.getValue());
			traversePreOrder(rootNode.getLeftNode());
			traversePreOrder(rootNode.getRightNode());
		}
	}

	public void iterativePreOrder(Node<Integer> rootNode) {
		List<Node> list = new ArrayList<>();
		Node<Integer> currentNode = rootNode;
		while (!list.isEmpty() || currentNode != null) {
			if (currentNode != null) {
				System.out.println(currentNode.getValue());
				if (currentNode.getRightNode() != null) {
					list.add(currentNode.getRightNode());
				}
				currentNode = currentNode.getLeftNode();
			} else {
				currentNode = list.remove(list.size()-1);
			}

		}
	}
}

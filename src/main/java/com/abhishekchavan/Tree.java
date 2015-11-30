package com.abhishekchavan;

import java.util.ArrayList;
import java.util.List;

public class Tree<T> {

	private Node<T> rootNode;

	public Node<T> getRootNode() {
		return rootNode;
	}

	public void setRootNode(Node<T> rootNode) {
		this.rootNode = rootNode;
	}

	public Tree(Node<T> rootNode) {
		this.rootNode = rootNode;
	}


	public static class Node<T> {

		private Node<T> leftNode;

		private Node<T> rightNode;

		private T value;

		public Node<T> getLeftNode() {
			return leftNode;
		}

		public void setLeftNode(Node<T> leftNode) {
			this.leftNode = leftNode;
		}

		public Node<T> getRightNode() {
			return rightNode;
		}

		public void setRightNode(Node<T> rightNode) {
			this.rightNode = rightNode;
		}

		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}
	}

}
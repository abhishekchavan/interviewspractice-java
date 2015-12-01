package com.abhishekchavan;

import java.util.List;

public class GraphDepthFirstSearch {

	public static void main(String[] args) {
		GraphNode<Integer> node = new GraphNode<>();
	}

	public void search(GraphNode<Integer> node) {
		if (node != null) {
			System.out.println(node.getValue());
			node.setVisited(true);
			List<GraphNode<Integer>> adjNodes = node.getAdjacentEdges();
			for (GraphNode<Integer> graphNode : adjNodes) {
				if (!graphNode.isVisited()) {
					search(graphNode);
				}
			}
		}
	}

}

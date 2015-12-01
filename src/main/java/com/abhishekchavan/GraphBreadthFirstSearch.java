package com.abhishekchavan;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class GraphBreadthFirstSearch {

	public static void main(String[] args) {
		GraphNode<Integer> node = new GraphNode<>();
	}

	public void search(GraphNode<Integer> node) {
		if (node != null) {
			Queue<GraphNode<Integer>> queue = new LinkedBlockingQueue<>();
			queue.add(node);
			System.out.println(node.getValue());

			while (!queue.isEmpty()) {
				GraphNode<Integer> currentNode = queue.poll();

				List<GraphNode<Integer>> list = currentNode.getAdjacentEdges();
				if (list != null) {
					for (GraphNode<Integer> graphNode : list) {
						if (!graphNode.isVisited()) {
							System.out.println(graphNode.getValue());
							graphNode.setVisited(true);
							queue.add(graphNode);
						}
					}
				}
			}
		}
	}

}

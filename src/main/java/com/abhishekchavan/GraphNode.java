package com.abhishekchavan;

import java.util.List;

public class GraphNode<T> {

	private List<GraphNode<T>> adjacentEdges;

	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	private boolean isVisited;

	public boolean isVisited() {
		return isVisited;
	}

	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}

	public List<GraphNode<T>> getAdjacentEdges() {
		return adjacentEdges;
	}

	public void setAdjacentEdges(List<GraphNode<T>> adjacentEdges) {
		this.adjacentEdges = adjacentEdges;
	}

	public GraphNode() {

	}

}

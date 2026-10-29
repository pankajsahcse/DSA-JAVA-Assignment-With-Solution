package com.graph;

import com.stack.MyQueueLinkList;
import com.stack.MyStackGeneric;

public class MyGraphList {

	MyLinkedList[] graph;

	public MyGraphList(int v) {
		graph = new MyLinkedList[v];
		// initialize Linked list
		for (int i = 0; i < graph.length; i++) {
			graph[i] = new MyLinkedList();
		}
	}

	public void addEdge(int source, int destination) {
		graph[source].addNode(destination);
	}

	public void printGraph() {
		for (int i = 0; i < graph.length; i++) {
			System.out.print(i + "===>");
			graph[i].displayList();
		}
	}

	public void dfsTraversal(int start) {

		System.out.println("DFS traversal : ");

		boolean[] visited = new boolean[graph.length];

		MyStackGeneric<Integer> stk = new MyStackGeneric<>();

		stk.push(start);
		visited[start] = true;

		String dfs = "";

		while (!stk.isEmpty()) {

			int v = stk.pop();

			dfs += v;

			// find all adjacent vertices
			int[] arr = graph[v].getAdjescentVertices(graph.length);

			// add unvisited adjacent vertices
			for (int i = 0; i < arr.length; i++) {

				if (arr[i] != -1 && !visited[arr[i]]) {

					visited[arr[i]] = true;
					stk.push(arr[i]);
				}
			}

			stk.displayData();

			System.out.println("======================");
		}

		System.out.println("Dfs : " + dfs);
	}

	public void BFSTraversal(int start) {
		System.out.println("BFS Traversal.....");
		boolean[] visited = new boolean[graph.length];
		for (int i = 0; i < visited.length; i++) {
			visited[i] = false;
		}
		MyQueueLinkList que = new MyQueueLinkList();
		// mark start vertex as visited
		visited[start] = true;
		que.enqueue(start);
		String bfs = "";
		while (!que.isEmpty()) {
			int v = que.dequeue();
			bfs += v;
			// get all adjescent vertices
			int[] arr = graph[v].getAdjescentVertices(graph.length);
			// add all non visited adjescent vertices in queue
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != -1 && !visited[arr[i]]) {
					visited[arr[i]] = true;
					que.enqueue(v);
				}
			}
			que.displayData();
			System.out.println("=========================");
		}
		System.out.println("Bfs: " + bfs);

	}
}

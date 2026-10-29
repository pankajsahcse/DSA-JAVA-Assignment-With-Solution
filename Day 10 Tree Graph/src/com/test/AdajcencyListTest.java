package com.test;

import java.util.Scanner;

import com.graph.MyGraphList;

public class AdajcencyListTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("How many vertisces");
		int v = sc.nextInt();
		MyGraphList g = new MyGraphList(v);
		storegraph(g, v);
		g.printGraph();
		g.dfsTraversal(1);

		sc.close();

	}

	private static void storegraph(MyGraphList g, int v) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < v; i++) {
			for (int j = 0; j < v; j++) {
				System.out.println("Is there a edge between " + i + "---" + j);
				int val = sc.nextInt();
				if (val > 0) {
					// unweighted graph
					g.addEdge(i, j);
					// for weighted graph
					// g.addEdge(i, j,weight);
				}
			}
		}
		sc.close();

	}

}

package com.test;

import java.util.Scanner;

public class AdjacencyMatricTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of vertices");
		int v = sc.nextInt();
		int[][] mygraph = new int[v][v];
		storeGraph(mygraph);
		displayMatrix(mygraph);
		sc.close();
	}

	private static void storeGraph(int[][] mygraph) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < mygraph.length; i++) {
			for (int j = 0; j < mygraph[0].length; j++) {
				System.out.println("Enter value for " + i + "," + j);
				mygraph[i][j] = sc.nextInt();
			}
		}
		sc.close();
	}

	private static void displayMatrix(int[][] mygraph) {

		for (int i = 0; i < mygraph.length; i++) {
			for (int j = 0; j < mygraph[0].length; j++) {
				System.out.print(mygraph[i][j] + "\t");
			}
			System.out.println();
		}
	}

}

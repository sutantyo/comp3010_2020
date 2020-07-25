package week1;

import graph.*;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class GraphTest {

	// the graph representation
	private static Graph g;

	// we use the following TreeMap to make it easier to access the vertices
	// e.g. to get the Vertex with id = 5, we use v.get(5)
	private static TreeMap<Integer,Vertex> vertexList;
	
	public static void main(String[] args) {
		
		g = new Graph();
		vertexList = new TreeMap<Integer,Vertex>();

		for (int i = -5; i <= 8; i++) {
			// make a new vertex with id i
			Vertex temp = new Vertex(i);
			// add the vertex to the graph
			g.addVertex(temp);

			// put the vertex into a TreeMap so we can access it easily
			vertexList.put(i, temp);
		}
		
		addEdge(1,2,0);
		addEdge(1,3,0);
		addEdge(1,7,0);
		addEdge(2,5,0);
		addEdge(4,5,0);
		addEdge(4,7,0);
		addEdge(4,8,0);
		addEdge(5,6,0);
		addEdge(5,7,0);
		
		// perform a DFS
		DFS(vertexList.get(1));
		System.out.println();
		
		
		// unmark all vertices
		g.unmarkAll();


		// perform a BFS
		BFS(vertexList.get(1));
		System.out.println();
	}
	
	// helper function to add bidirectional edges to the graph
	public static void addEdge(int a, int b, int w) {
		g.addEdge(vertexList.get(a), vertexList.get(b), w);
		g.addEdge(vertexList.get(b), vertexList.get(a), w);
	}
	
	/**
	 * Performs a DFS traversal of a connected component in a graph,
	 * starting from the vertex a.
	 * 
	 * @param the starting vertex a
	 */
	public static void DFS(Vertex a) {
		System.out.print(a.getID() + " ");

			/* Complete the code */
	}
	
	/** Perform a BFS traversal of a connected component in a graph, 
	 *  starting from the vertex a.
	 * 
	 * @param the starting vertex a
	 */
	public static void BFS(Vertex a) {
		if (!a.isMarked()) {
			a.setMarked();
			Queue<Vertex> q = new LinkedList<Vertex>();
			q.add(a);
			
			/* Complete the code */
		}
	}
	
}
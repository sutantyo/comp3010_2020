package week8;

import graph.*;
import java.util.*;

public class ShortestPath {
	
	// the graph representation
	private static Graph g;
	
	// we use the following TreeMap to make it easier to access the vertices
	// e.g. to get the Vertex with id = 5, we use v.get(5)
	private static TreeMap<Integer,Vertex> vertexList;
	
	public static void main(String[] args) {
		
		int N = 8;
		g = new Graph();
		vertexList = new TreeMap<Integer,Vertex>();

		for (int i = 1; i <= N; i++) {
			// make a new vertex with id i
			Vertex temp = new Vertex(i);
			// add the vertex to the graph
			g.addVertex(temp);

			// put the vertex into a TreeMap so we can access it easily
			vertexList.put(i, temp);
		}
	
		// create the edges (with weights this time)
		addEdge(1,2,2);
		addEdge(1,3,3);
		addEdge(1,7,20);
		addEdge(2,5,2);
		addEdge(4,5,5);
		addEdge(4,7,5);
		addEdge(4,8,2);
		addEdge(5,6,4);
		addEdge(5,7,15);
		addEdge(7,8,10);
		
		g.unmarkAll();
		
		shortestPath(vertexList.get(1));
		
	}
	
	// helper function to add bidirectional edges to the graph
	public static void addEdge(int a, int b, int w) {
		g.addEdge(vertexList.get(a), vertexList.get(b), w);
		g.addEdge(vertexList.get(b), vertexList.get(a), w);
	}
	
	/**
	 * Return the shortest path from vertex source to every other reachable 
	 * vertices in the graph
	 * 
	 * @param source	the starting vertex
	 * @return			a hashmap containing the distance from the source vertex
	 * 					to every other reachable vertices in the graph
	 */
	public static HashMap<Vertex,Integer> shortestPath(Vertex source){

		// the hashmap where we put our answer in, mapping vertices to the distance
		// for example, if the shortest path from source to a is 5 and to b is 10, then
		// the map contains (a -> 5) and (b -> 10)
		HashMap<Vertex,Integer> m = new HashMap<>();

		// priority queue used to select the cheapest edge on each iteration
		PriorityQueue<Edge> pq = new PriorityQueue<>();

		// mark the visited vertices
		HashSet<Vertex> visited = new HashSet<>();
	
		// start with the source vertex as the current vertex
		Vertex current = source;
		m.put(current, 0);
		visited.add(current);
		
		// each iteration visits a new vertex, so we only need to do this N-1 times
		// (where N is the number of vertices)
		for (int count = 0; count < vertexList.size()-1; count++) {
			
			// look at all the neighbours of the current vertex
			for(Vertex v : current.getNeighbours().keySet()) {
				int weight = current.getNeighbours().get(v);
				pq.add(new Edge(current,v,weight));
				if (!m.containsKey(v))
					m.put(v, weight);
				else {
					if (m.get(current)+weight < m.get(v)) {
						m.put(v, weight);
					}
				}
			}
			
			// now find the cheapest vertex to go to
			Edge best = pq.poll();
			while (visited.contains(best.getSource()) && visited.contains(best.getEnd())) {
				best = pq.poll();
			}
			current = best.getEnd();
			visited.add(current);
		}
		
		// debugging
		System.out.println(m);
		return m;
	}
	

}

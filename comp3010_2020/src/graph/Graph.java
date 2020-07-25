package graph;

import java.util.TreeSet;
import java.util.TreeMap;

/**
 * Class Graph is a representation of a graph using an adjacency list.
 * 
 * The Graph class contains one data structure: a TreeSet<Vertex> that 
 * contains all the vertices in the graph. 
 * 
 * A TreeSet is a Set data structure where the elements are ordered. See
 * the Javadoc documentation for more information. The vertex ordering is
 * lexicographical (see Vertex class for more information)
 * 
 * This is just one possible implementation of a graph which you can use as a
 * starting point and also to provide a common ground for workshop submissions.
 * 
 * You are welcome to (and actually encouraged) to write your own implementation 
 * or extend this one, but for weekly workshop submissions, I will assume
 * the use of this class (unless you have a very good reason why you don't
 * want to use this class). 
 * 
 * Change Log:
 * 
 *  30/7/2019 - Initial release
 *  
 * @author daniel.sutantyo@mq.edu.au
 *
 */
public class Graph {

	private TreeSet<Vertex> vertices;
	
	// Constructor
	public Graph() {
		vertices = new TreeSet<Vertex>();
	}
	
	/**
	 * Returns a list of vertices in the graph. The method returns a new
	 * TreeSet<Vertex> so that the original graph cannot be modified via 
	 * the returned object.
	 * 
	 * @return the list of vertices
	 */
	public TreeSet<Vertex> getVertices(){
		return new TreeSet<Vertex>(vertices);
	}
	
	/**
	 * Adds a vertex to the graph.
	 * 
	 * @param v the vertex to be added
	 */
	public void addVertex(Vertex v) {
		vertices.add(v);
	}
	
	/**
	 * Create an edge between two vertices in the graph
	 * 
	 * @param a
	 * @param b
	 * @param weight
	 * @return
	 */
	public boolean addEdge(Vertex a, Vertex b, int weight) {
		if (vertices.contains(a) && vertices.contains(b)) {
			a.setNeighbour(b, weight);
			return true;
		}
		return false;
	}
	

	/**
	 * Reset the graph so that all vertices are unmarked (i.e. has not been
	 * visited)
	 */
	public void unmarkAll() {
		for (Vertex v : vertices) {
			v.setUnmarked();
		}
	}
	
	
}
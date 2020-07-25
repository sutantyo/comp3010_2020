package graph;

import java.util.TreeMap;

/**
 * Class Vertex represents a single vertex in a graph
 * 
 * @author daniel.sutantyo@mq.edu.au
 */
public class Vertex implements Comparable<Vertex>{

	/* the label of the vertex */
	private int id;
	
	/* used to indicate if a vertex has been visited */
	private boolean marked;
	
	
	/* the list of neighbours of the current vertex and the weight of the 
	 * edge connecting said neighbour to the current vertex.
	 * 
	 * For example, if the TreeMap contains
	 * 
	 *   [ (Vertex B, 5), (Vertex C, 10) ]
	 *   
	 * this means that Vertex B is a neighbour with edge of weight 5 and 
	 * Vertex C is a neighbour with edge of weight 10.
	 */
	private TreeMap<Vertex,Integer> neighbours;
	

	/**
	 * Constructor
	 * 
	 * Create a new vertex with a given id
	 * 
	 * @param id		   the vertex id	
	 * @param description  description of the vertex (optional)
	 */
	
	public Vertex(int id) {
		this.id = id;
		this.marked = false;
		this.neighbours = new TreeMap<Vertex,Integer>();
	}
	
	/**
	 * Return the set of vertices which are adjacent to the current vertex
	 * and the weight of the edges connecting them. The method returns a new 
	 * TreeSet so that the original list of neighbours cannot be modified by 
	 * the returned object.
	 * 
	 * @return the list of neighbours
	 */
	public TreeMap<Vertex,Integer> getNeighbours(){
		return new TreeMap<Vertex,Integer>(neighbours);
	}
	
	/**
	 * This method accepts a Vertex v and add it as a neighbour 
	 * to the current vertex. 
	 * 
	 * @param 	v	the vertex to be added as a neighbour 
	 * @return the previous 
	 * 		   false otherwise
	 */
	public Integer setNeighbour(Vertex v, Integer weight) {
		return this.neighbours.put(v,weight);
	}
	
	/**
	 * Return the number of vertices adjacent to the current vertex.
	 * 
	 * @return number of neighbouring vertices
	 */
	public int numberOfNeighbours() {
		return this.neighbours.size();
	}
	
	
	/**
	 * Check whether or not a vertex has been visited (marked)
	 * 
	 * @return true if vertex has been marked
	 */
	public boolean isMarked() {
		return this.marked;
	}
	
	/**
	 * Set the vertex to be marked (visited)
	 */
	public void setMarked() {
		this.marked = true;
	}

	/**
	 * Set the vertex to be unmarked (not visited)
	 */
	public void setUnmarked() {
		this.marked = false;
	}

	
	/**
	 * Return the vertex ID
	 * 
	 * @return the vertex id
	 */
	public int getID() {
		return id;
	}
	
	public String toString() {
		return "Vertex " + this.id;
	}

	/** 
	 * Used to compare two different Vertex objects. The one with smaller id
	 * is considered to be smaller. 
	 */
	@Override
	public int compareTo(Vertex other) {
		if (other.getID() < this.getID())
			return 1;
		else if (other.getID() == this.getID())
			return 0;
		return -1;
	}
	
}
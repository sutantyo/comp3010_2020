package graph;

/**
 * Class Edge represents an edge in a graph
 * 
 * @author daniel.sutantyo@mq.edu.au
 */
public class Edge implements Comparable<Edge>{
	

	private Vertex source;
	private Vertex end;
	private int weight;
	
	/**
	 * Create a new edge between two vertices
	 * 
	 * @param source	the starting vertex
	 * @param end		the end vertex
	 * @param weight	the weight of the edge
	 */
	public Edge(Vertex source, Vertex end, int weight) {
		this.source = source;
		this.end = end;
		this.weight = weight;
	}
	
	
	/** Getters */
	public Vertex getSource() {
		return this.source;
	}
	public Vertex getEnd() {
		return this.end;
	}
	public int getWeight() {
		return this.weight;
	}
	
	/**
	 *  Method to compare two different edges based on their weight 
	 */
	@Override
	public int compareTo(Edge o) {
		if (o.weight > this.weight)
			return -1;
		else if (o.weight == this.weight)
			return 0;
		return 1;
	}
	
	public String toString() {
		return "" + this.source + " -> " + this.end +  " w: " + this.weight;
	}

}

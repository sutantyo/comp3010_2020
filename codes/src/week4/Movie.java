package week4;
/**
 * Class Movie contains the information of a movie, to be used with class
 * MovieAnalyser. 
 * 
 * Change Log:
 * 
 * 6/8/2019 - Initial release
 *  
 * @author daniel.sutantyo@mq.edu.au
 *
 */
public class Movie {
	
	private String title;
	private String director;
	private Integer duration;
	private String actor_a;
	private String actor_b;
	private String actor_c;
	private Long gross;
	private Long budget;
	private Integer year;
	
	
	// Constructor 
	public Movie(String title, String[] data) {
		
		this.title = title;
		this.director = data[0];

		if (data[1].equals(""))
			this.duration = 0;
		else
			this.duration = Integer.parseInt(data[1]);

		this.actor_a = data[2];
		this.actor_b = data[3];
		this.actor_c = data[4];

		if (data[5].equals(""))
			this.gross = 0L;
		else
			this.gross = Long.parseLong(data[5]);

		if (data[6].equals(""))
			this.budget = 0L;
		else
			this.budget = Long.parseLong(data[6]);
		
		if (data[7].equals(""))
			this.year = 0;
		else
			this.year = Integer.parseInt(data[7]);
		
	}
	
	// Getters
	public String getTitle() {
		return this.title;
	}
	public String getDirector() {
		return this.director;
	}
	public Integer getDuration() {
		return this.duration;
	}
	public String getActor_a() {
		return this.actor_a;
	}
	public String getActor_b() {
		return this.actor_b;
	}
	public String getActor_c() {
		return this.actor_c;
	}
	public Long getGross() {
		return this.gross;
	}
	public Long getBudget() {
		return this.budget;
	}
	public Integer getYear() {
		return this.year;
	}

	
	
}
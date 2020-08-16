package week4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

public class MovieAnalyser {

	/**
	 * Read the movie data from a csv file, then return an ArrayList containing
	 * Movie objects generated from the data in the csv (each entry in the
	 * ArrayList corresponds to a line in the csv file)
	 * 
	 * @param infile the String representing the name of the file to be opened
	 * @throws IOException if file is not found
	 * @return an arraylist containing Movie objects 
	 */
	public static ArrayList<Movie> readMovieData(String infile) throws IOException{
		
		ArrayList<Movie> movies = new ArrayList<>();
		BufferedReader in = new BufferedReader(new FileReader(infile));
		
		String s;
		s = in.readLine(); // skip the first line, i.e the CSV headers
		int i = 1;
		while ((s = in.readLine()) != null) {
			
			// titles with commas in them is a bit more troublesome
			// but these titles are enclosed in double quotes (") 
			// so we just need to extract everything within the double quotes

			String title;
			int end;
			
			// if the first character is a ", we know the title contains commas
			if (s.charAt(0) == '\"') {
				end = s.lastIndexOf('\"');
				title = s.substring(1,end);
				end = end+1;
			}
			// otherwise just extract the title 
			else {
				end = s.indexOf(',');
				title = s.substring(0,end);
			}
			s = s.substring(end+1);

			// extract the rest of the data (comma separated)
			String[] data = s.split(",",-1);

			// create a new Movie
			movies.add(new Movie(title,data));
		}
		return movies;
	}
	
	
	/**
	 * Creates a mapping from Actors/Directors to a list of movies they were 
	 * in (based on the movie list), but only if the Actor/Director has been 
	 * in at least n movies .
	 * 
	 * @param movies an ArrayList of Movie object containing an information 
	 *               about the movie
	 * @param n      the number of movies the Actor/Director should be in
	 * @return       a mapping (TreeMap) of Actors/Directors to the set of
	 *               movies they were in (as a TreeSet)
	 */
	public static TreeMap<String,TreeSet<String>> mapActorMovie(ArrayList<Movie> movies, int n) {
		
		return null;
	}
	
	public static void main(String[] args) {
		
		ArrayList<Movie> movies = new ArrayList<>();
		
		System.out.println("test");
		try {	
			movies = readMovieData("codes/src/week4/movie_data.csv");
		}
		catch (IOException e) {
			System.out.println("Exception occured: " + e);
		}
		
		// check if the movie data was read correctly
		/*
		System.out.println(movies.size());
		System.out.println(movies.get(0).getTitle());
		System.out.println(movies.get(1).getDirector());
		System.out.println(movies.get(2).getActor_a());
		*/
		
		TreeMap<String,TreeSet<String>> data = mapActorMovie(movies,10);
		/*
		System.out.println(data.get("Brad Pitt"));
		System.out.println(data.get("Natalie Portman"));
		*/
	}
	
	
}
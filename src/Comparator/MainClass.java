package Comparator;

import java.util.ArrayList;
import java.util.Collections;

import Comparator.Movie;

public class MainClass {

	public static void main(String[] args) {
		Movie m1=new Movie("Force Awakens", 8, 2015);
		Movie m2=new Movie("Star Wars", 9, 1977);
		Movie m3=new Movie("Empire Strikes Back", 5, 1980);
		Movie m4=new Movie("Return of the Jedi", 3, 1983);
		
		 ArrayList<Movie> list = new ArrayList<Movie>();
		 
	     list.add(m1);
	     list.add(m2);
	     list.add(m3);
	     list.add(m4);
	     
	     
	     System.out.println("based on Rating");
	     BasedOnRating rating=new BasedOnRating();
	     Collections.sort(list,rating);
	     for (Movie movie: list) {
	            System.out.println(movie.getRating() + " " +
	                               movie.getName() + " " +
	                               movie.getYear());
	     }
	     System.out.println("************************");
	     
	     System.out.println("based on name");
	     BasedOnName name=new BasedOnName();
	     Collections.sort(list,name);
	     for (Movie movie: list) {
	            System.out.println(movie.getRating() + " " +
	                               movie.getName() + " " +
	                               movie.getYear());
	     }
	}
}

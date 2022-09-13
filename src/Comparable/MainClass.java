package Comparable;

import java.util.*;

public class MainClass {
	public static void main(String[] args) {
	
	Movie m1=new Movie("Force Awakens", 8.3, 2015);
	Movie m2=new Movie("Star Wars", 8.7, 1977);
	Movie m3=new Movie("Empire Strikes Back", 8.8, 1980);
	Movie m4=new Movie("Return of the Jedi", 8.4, 1983);
	
	 ArrayList<Movie> list = new ArrayList<Movie>();
	 
     list.add(m1);
     list.add(m2);
     list.add(m3);
     list.add(m4);
     
     Collections.sort(list);
     
     
     for (Movie movie: list)
     {
         System.out.println(movie.getName() + " " +
                            movie.getRating() + " " +
                            movie.getYear());
     }
}
}

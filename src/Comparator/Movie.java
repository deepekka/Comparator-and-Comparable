package Comparator;

public class Movie {

	private int rating;
	private String name;
	private int year;
	public Movie(String name,int rating, int year) {
		super();
		this.rating = rating;
		this.name = name;
		this.year = year;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}

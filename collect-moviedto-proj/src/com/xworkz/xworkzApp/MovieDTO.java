package com.xworkz.xworkzApp;



public class MovieDTO {

	private String movieName;
	private String genre;
	private double rating;
	private double duration;
	
	public MovieDTO() {
		
	}

	public MovieDTO(String movieName, String genre, double rating, double duration) {
		super();
		this.movieName = movieName;
		this.genre = genre;
		this.rating = rating;
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "MovieDTO [movieName=" + movieName + ", genre=" + genre + ", rating=" + rating + ", duration=" + duration
				+ "]";
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}
	
	public int hashCode() {
		
		return super.hashCode();
	}
	
	
}

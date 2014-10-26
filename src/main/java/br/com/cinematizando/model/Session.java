package br.com.cinematizando.model;

import java.util.Date;

public class Session {
	
	private Movie movie;
	private Date date;
	private Integer capacity;
	
	public Session() {}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public Integer getCapacity() {
		return capacity;
	}
	
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	
}

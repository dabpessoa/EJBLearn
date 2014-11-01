package br.com.cinematizando.dao;

import java.util.List;

import javax.annotation.PostConstruct;

import br.com.cinematizando.model.Movie;

public class MovieDAO extends AbstractDao<Movie> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8686390125721906475L;
	
	@PostConstruct
	protected void initialize() {
		System.out.println( entityManager );
	}
}

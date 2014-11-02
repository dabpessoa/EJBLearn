package br.com.cinematizando.dao;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import br.com.cinematizando.model.Movie;

public class MovieDAO extends AbstractDao<Movie> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8686390125721906475L;
	
	@PostConstruct
	protected void initialize() {
		
		System.out.println( find("from Movie where id in (?)", new Object[] { Arrays.asList(1l, 2l, 3l) }) );
	}
}

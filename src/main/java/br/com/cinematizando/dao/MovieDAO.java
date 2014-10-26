package br.com.cinematizando.dao;

import java.util.Arrays;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.cinematizando.model.Movie;

@Stateless
public class MovieDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	private Integer num = 0;
	
	public MovieDAO() {
		System.out.println("Entrou no construtor....");
		System.out.println("MovieDAO.MovieDAO()");
	}
	
	@SuppressWarnings("unchecked")
	public void teste() {
		
		Query q = entityManager.createQuery("from Movie"); 
		List<Movie> movies = q.getResultList();
		System.out.println(movies);
		System.out.println(Arrays.toString(movies.toArray()));
		
		System.out.println("Número: "+(++num));
		
	}
	
	
}

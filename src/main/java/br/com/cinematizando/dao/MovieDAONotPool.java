package br.com.cinematizando.dao;

import java.util.Arrays;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.cinematizando.model.Movie;

@Stateless
public class MovieDAONotPool {

  @PersistenceContext
  private EntityManager entityManager;

  private Integer i = 0;

  @SuppressWarnings("unchecked")
  public void teste() {
    System.out.println(++i);
    Query q = entityManager.createQuery("from Movie");
    List<Movie> movies = q.getResultList();
    System.out.println(Arrays.toString(movies.toArray()));
  }


}

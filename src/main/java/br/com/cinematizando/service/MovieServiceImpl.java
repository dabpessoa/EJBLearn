package br.com.cinematizando.service;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import br.com.cinematizando.dao.MovieDAO;
import br.com.cinematizando.model.Movie;

@Stateless
public class MovieServiceImpl implements MovieService{
  
  @Inject
  private MovieDAO movieDao;
  
  @TransactionAttribute(TransactionAttributeType.REQUIRED)
  public void insert(Movie entity) {
    movieDao.insert(entity);
  }

  @TransactionAttribute(TransactionAttributeType.REQUIRED)
  public Movie update(Movie entity) {
    return movieDao.update(entity);
  }

  @TransactionAttribute(TransactionAttributeType.REQUIRED)
  public void delete(Movie entity) {
    movieDao.delete(entity);
  }
  
}
package br.com.cinematizando.service;

import java.util.concurrent.TimeUnit;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import org.jboss.ejb3.annotation.TransactionTimeout;

import br.com.cinematizando.dao.MovieDAO;
import br.com.cinematizando.interceptors.Logger;
import br.com.cinematizando.model.Movie;

@Stateless
@Logger
public class MovieServiceImpl implements MovieService{
  
  @Inject
  private MovieDAO movieDao;
  
  @TransactionAttribute(value =TransactionAttributeType.REQUIRED)
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
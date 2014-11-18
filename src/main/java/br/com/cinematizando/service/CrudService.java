package br.com.cinematizando.service;


public interface CrudService<T> {
  
  public void insert(T entity);
  
  public T update(T entity);
  
  public void delete(T entity);
  
}

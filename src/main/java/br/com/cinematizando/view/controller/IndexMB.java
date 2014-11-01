package br.com.cinematizando.view.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.cinematizando.dao.MovieDAO;
import br.com.cinematizando.qualifier.AnotherEntityManager;

@Named
@ViewScoped
public class IndexMB implements Serializable{

  private static final long serialVersionUID = 7662583246021120941L;
  
  @Inject
  private MovieDAO dao;
  
  @PostConstruct
  protected void initialize() {
	  System.out.println( dao );
  }
}

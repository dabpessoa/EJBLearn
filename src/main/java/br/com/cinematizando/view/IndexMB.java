package br.com.cinematizando.view;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.cinematizando.dao.MovieDAO;

@Named
@ViewScoped
public class IndexMB implements Serializable{

  private static final long serialVersionUID = 7662583246021120941L;
  
  @Inject
  private MovieDAO dao;

  public String getName(){
	dao.teste();
    return "AEEE";
  }
  
}

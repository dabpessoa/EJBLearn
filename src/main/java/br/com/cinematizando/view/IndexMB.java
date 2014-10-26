package br.com.cinematizando.view;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.com.cinematizando.dao.MovieDAO;

@Named
@ViewScoped
public class IndexMB implements Serializable{

  private static final long serialVersionUID = 7662583246021120941L;
  
  @EJB
  private MovieDAO dao;

  public String getName(){
	dao.teste();
    return "AEEE";
  }
  
}

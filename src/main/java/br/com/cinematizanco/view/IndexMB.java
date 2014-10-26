package br.com.cinematizanco.view;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class IndexMB implements Serializable{

  private static final long serialVersionUID = 7662583246021120941L;

  public String getName(){
    return "AEEE";
  }
  
}

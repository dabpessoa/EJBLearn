package br.com.cinematizando.view.controller.test;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.com.cinematizando.service.MovieService;
import br.com.cinematizando.service.TestService;

@Named
@ViewScoped
public class TestViewMB implements Serializable {
  
  @EJB
  private TestService service;
  
  public String getServiceId(){
    return service.toString();
  }
  public String getId(){
    return service.getId();
  }
}

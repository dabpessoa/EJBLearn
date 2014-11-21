package br.com.cinematizando.view.controller.test;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.cinematizando.service.TestService;

@Named
@RequestScoped
public class TestRequestMB implements Serializable {
  
  @EJB
  private TestService service;
  
  public String getServiceId(){
    return service.toString();
  }
  public String getId(){
    return service.getId();
  }
  
}

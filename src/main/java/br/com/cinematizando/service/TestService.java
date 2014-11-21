package br.com.cinematizando.service;

import java.util.UUID;

import javax.ejb.Stateless;

import org.jboss.ejb3.annotation.Pool;

@Stateless
@Pool(value = "slsb-strict-max-pool")
public class TestService {

  private final String id;
  
  public TestService() {
     id = UUID.randomUUID().toString();
  }
  
  @Override
  public String toString() {
    return super.toString();
  }

  public String getId() {
    return id;
  }
  
}

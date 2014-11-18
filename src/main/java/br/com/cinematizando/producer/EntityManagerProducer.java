package br.com.cinematizando.producer;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

@RequestScoped
public class EntityManagerProducer {

//	@PersistenceContext(unitName = "cinematizando_pu")
//	private EntityManager entityManager;
//	
//	@PersistenceContext(unitName = "cinematizando_pu2")
//	private EntityManager anotherEntityManager;
	
	@PersistenceUnit(unitName = "cinematizando_pu")
	private EntityManagerFactory factory;
	
	@Produces
	@RequestScoped
	public EntityManager getEntityManager() {
		return factory.createEntityManager();
	}
	
	public void destroyEntityManager(@Disposes EntityManager entityManager){
	  entityManager.close();
	}
	
//	@Produces @AnotherEntityManager
//	@RequestScoped
//	public EntityManager getAnotherEntityManager() {
//		return anotherEntityManager;
//	}
}

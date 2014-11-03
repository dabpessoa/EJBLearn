package br.com.cinematizando.producer;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

@ApplicationScoped
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
	
//	@Produces @AnotherEntityManager
//	@RequestScoped
//	public EntityManager getAnotherEntityManager() {
//		return anotherEntityManager;
//	}
}

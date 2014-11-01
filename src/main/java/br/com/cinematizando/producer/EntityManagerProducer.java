package br.com.cinematizando.producer;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.cinematizando.qualifier.AnotherEntityManager;

@ApplicationScoped
public class EntityManagerProducer {

	@PersistenceContext(unitName = "cinematizando_pu")
	private EntityManager entityManager;
	
	@PersistenceContext(unitName = "cinematizando_pu2")
	private EntityManager anotherEntityManager;
	
	@Produces
	@RequestScoped
	public EntityManager getEntityManager() {
		return entityManager;
	}
	
	@Produces @AnotherEntityManager
	@RequestScoped
	public EntityManager getAnotherEntityManager() {
		return anotherEntityManager;
	}
}

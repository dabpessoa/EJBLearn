package br.com.cinematizando.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.cinematizando.model.Place;

/**
 * 
 * @author dabpessoa
 * @since 28.10.2014
 *
 */

@Stateless
public class PlaceDAO {

	@Inject
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public List<Place> listAll() {
		return entityManager.createQuery("from Place").getResultList();
	}
	
}

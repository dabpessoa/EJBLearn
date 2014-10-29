package br.com.cinematizando.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import org.jboss.ejb3.annotation.Pool;

import br.com.cinematizando.dao.PlaceDAO;
import br.com.cinematizando.model.Place;

/**
 * 
 * @author dabpessoa
 * @since 28.10.2014
 *
 */

@Stateless
@Pool(value = "slsb-strict-max-pool")
public class PlaceService {

	@Inject
	private PlaceDAO dao;
	
	public List<Place> listAll() {
		return dao.listAll();
	}
	
}

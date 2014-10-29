package br.com.cinematizando.view.controller;

import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.cinematizando.model.Place;
import br.com.cinematizando.service.PlaceService;

/**
 * 
 * @author dabpessoa
 * @since 28.10.2014
 *
 */

@Named
@ViewScoped
public class PlaceController {

	@Inject
	private PlaceService service;
	
	public String getList() {
		List<Place> places = service.listAll();
		Arrays.toString(places.toArray());
		return "OK";
	}
	
}

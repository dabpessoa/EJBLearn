package br.com.cinematizando.service;

import javax.ejb.Local;

import br.com.cinematizando.model.Movie;

@Local
public interface MovieService extends CrudService<Movie> {

}

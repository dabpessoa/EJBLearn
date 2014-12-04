package br.com.cinematizando.view.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.cinematizando.model.Movie;
import br.com.cinematizando.service.MovieService;

@Named
@ViewScoped
public class MovieController implements Serializable {

  private static final long serialVersionUID = 6514938499489588500L;
  
  @Inject
  private MovieService movieService;

  private List<Movie> movies;
  private Movie movie;
  
  @PostConstruct
  public void init(){
    Movie movie2 = new Movie();
    movie2.setOriginalTitle("teste");
    movieService.insert( movie2 );
  }
  
  public Movie getMovie() {
    return movie;
  }
  public void setMovie(Movie movie) {
    this.movie = movie;
  }
  public List<Movie> getMovies() {
    return movies;
  }
  public void setMovies(List<Movie> movies) {
    this.movies = movies;
  }
  
}

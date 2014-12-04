package br.com.cinematizando.service;

import java.util.Date;

import javax.inject.Inject;
import javax.naming.NamingException;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import br.com.cinematizando.dao.AbstractDao;
import br.com.cinematizando.dao.MovieDAO;
import br.com.cinematizando.model.Model;
import br.com.cinematizando.model.Movie;
import br.com.cinematizando.producer.EntityManagerProducer;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class MovieServiceTest {
  
  @Deployment
  public static Archive<?> prepareDeployment(){
    return ShrinkWrap.create( JavaArchive.class )
        .addClass( EntityManagerProducer.class)
        .addClass( Model.class)
        .addClass( Movie.class )
        .addClass( CrudService.class )
        .addClass( MovieService.class )
        .addClass( MovieServiceImpl.class )
        .addClass( MovieDAO.class )
        .addClass( AbstractDao.class )
        .addAsResource("test-persistence.xml", "META-INF/persistence.xml")
        .addAsManifestResource(EmptyAsset.INSTANCE , "beans.xml");
  }
  
  @Inject MovieService service;
  
  @Test
  public void teste() throws NamingException{
    Movie movie = createMovie();
    
    service.insert( movie );
    
    assertNotNull( movie.getId() );
  }
  
  
  public static Movie createMovie(){
    Movie movie = new Movie();
    movie.setOriginalTitle("The Arquillian Atack");
    movie.setRelease( new Date() );
    movie.setSynopsis("Thats it, not really easy");
    return movie;
  }
  
}

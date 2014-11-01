package br.com.cinematizando.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.cinematizando.model.Movie;
import br.com.cinematizando.model.Place;

@SuppressWarnings("all")

public abstract class AbstractDao<Entity> implements Serializable {
	
	private Class<Entity> klass;

	protected @Inject EntityManager entityManager;
	
	public AbstractDao() {
		
		final Type type = getClass().getGenericSuperclass();
		
		ParameterizedType parameterizedType;
		
		try {
			parameterizedType = (ParameterizedType) type;	
		} catch (ClassCastException e) {
			parameterizedType = (ParameterizedType) ((Class<?>) type).getGenericSuperclass(); 
		}
		
		this.klass = (Class<Entity>) parameterizedType.getActualTypeArguments()[0];
	}
	
	public void insert(Entity entity) {
		entityManager.persist(entity);
	}
	
	public Entity update(Entity entity) {
		return entityManager.merge(entity);
	}
	
	public void delete(Entity entity) {
		entityManager.remove(entity);
	}
	
	public Entity findById(Serializable pk) {
		return entityManager.find(klass, pk);
	}
	
	public List<Entity> find(String sql, final Object ... params) {
		
		int index = 0;
		while(sql.contains("?")) {
			sql = sql.replaceFirst("\\?\\d*", ":p_" + index++);
		}
		
		// Query q = entityManager.createQuery(sql);
		
		final Matcher matcher = Pattern.compile("(\\:\\w+)").matcher(sql);
		
		Map<String, Object> map = new HashMap<String, Object>(0);
		index = 0;
		while(matcher.find()) {
			String key = matcher.group(); 
			if( !map.containsKey(key) ){
				map.put(key, params[index++]);
			}
		}
		
		for(Map.Entry<String, Object> entry : map.entrySet()) {
			System.out.println( entry );
		}
		
		//return q.getResultList();
		
		return null;
	}
	
	public static void main(String[] args) {

		String sql = "from Movie where id = :identifier and name = ? and other = :identifier and param1 = ?1";
		
		new AbstractDao<Movie>( ) {}.find(sql, Arrays.asList(1,2,3).toArray());
		
	}
	
}

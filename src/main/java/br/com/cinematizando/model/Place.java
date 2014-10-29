package br.com.cinematizando.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

/**
 * 
 * @author dabpessoa
 * @since 28.10.2014
 *
 */

@Entity
@Table(name="place", schema="cinematizando")
public class Place extends Model {

	private String name;
//	private Address address;
	@Enumerated(EnumType.ORDINAL)
	private PlaceType type;
	
	public Place() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public Address getAddress() {
//		return address;
//	}
//
//	public void setAddress(Address address) {
//		this.address = address;
//	}

	public PlaceType getType() {
		return type;
	}

	public void setType(PlaceType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Place [name=" + name + ", type=" + type + "]";
	}
	
}

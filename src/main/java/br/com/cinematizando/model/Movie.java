package br.com.cinematizando.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="movie", schema="cinematizando")
public class Movie extends Model {

	private String originalTitle;
	private String translatedTitle;
	private Date release;
	private String synopsis;
	
	public Movie() {}

	public String getOriginalTitle() {
		return originalTitle;
	}

	public void setOriginalTitle(String originalTitle) {
		this.originalTitle = originalTitle;
	}

	public String getTranslatedTitle() {
		return translatedTitle;
	}

	public void setTranslatedTitle(String translatedTitle) {
		this.translatedTitle = translatedTitle;
	}

	public Date getRelease() {
		return release;
	}

	public void setRelease(Date release) {
		this.release = release;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	@Override
	public String toString() {
		return "Movie [originalTitle=" + originalTitle + ", translatedTitle="
				+ translatedTitle + ", release=" + release + ", synopsis="
				+ synopsis + "]";
	}
	
}

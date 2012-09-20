package com.icooper.buttercho.persistance.dao;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.icooper.buttercho.persistance.dao.card.DeckDao;

/**
 * Represents the stage in single player mode.
 * 
 * @author Nicholas Leong
 *
 */
@Document
public class StageDao {
	
	@Indexed(unique = true)
	private String id;
	
	@Field
	private String name;
	
	@DBRef
	private DeckDao deck;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public DeckDao getDeck() {
		return deck;
	}
	public void setDeck(DeckDao deck) {
		this.deck = deck;
	}
}

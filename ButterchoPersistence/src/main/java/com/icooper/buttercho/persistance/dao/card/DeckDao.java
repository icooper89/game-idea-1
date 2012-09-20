package com.icooper.buttercho.persistance.dao.card;

import java.util.LinkedList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * 
 * @author Nicholas Leong
 *
 */
@Document
public class DeckDao {

	@Indexed(unique = true)
	private String id;
	
	@Field
	private String deckName;
	
	// May want to change this and use our own references
	// so that we can cache the entire card database in memory.
	@DBRef
	private LinkedList<CardDao> cards;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LinkedList<CardDao> getCards() {
		return cards;
	}

	public void setCards(LinkedList<CardDao> cards) {
		this.cards = cards;
	}

	public String getDeckName() {
		return deckName;
	}

	public void setDeckName(String deckName) {
		this.deckName = deckName;
	}	

}

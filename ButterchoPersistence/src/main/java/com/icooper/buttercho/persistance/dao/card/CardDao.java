package com.icooper.buttercho.persistance.dao.card;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.*;

/**
 * 
 * @author Nicholas Leong
 *
 */
@Document
public abstract class CardDao {

	@Indexed(unique = true)
	private String id;
	
	@Field
	private String cardName;
	
	@Field
	private Class<? extends CardDao> cardType;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Class<? extends CardDao> getCardType() {
		return cardType;
	}
	public void setCardType(Class<? extends CardDao> cardType) {
		this.cardType = cardType;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}	
}

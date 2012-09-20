package com.icooper.buttercho.persistance.dao.user;

import java.util.LinkedList;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.icooper.buttercho.persistance.dao.card.DeckDao;

/**
 * 
 * @author Nicholas Leong
 *
 */
@Document
public class PlayerDao {

	@Indexed(unique = true)
	private String id;
	
	@Field
	private int experiencePoints;

	@Field
	private int earnedMoney;
	
	@Field
	private int purchasableMoney;
	
	@Field
	private int stageId;
	
	@Field
	private LinkedList<DeckDao> decks;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getExperiencePoints() {
		return experiencePoints;
	}

	public void setExperiencePoints(int experiencePoints) {
		this.experiencePoints = experiencePoints;
	}

	public int getEarnedMoney() {
		return earnedMoney;
	}

	public void setEarnedMoney(int earnedMoney) {
		this.earnedMoney = earnedMoney;
	}

	public int getPurchasableMoney() {
		return purchasableMoney;
	}

	public void setPurchasableMoney(int purchasableMoney) {
		this.purchasableMoney = purchasableMoney;
	}

	public int getStageId() {
		return stageId;
	}

	public void setStageId(int stageId) {
		this.stageId = stageId;
	}

	public LinkedList<DeckDao> getDecks() {
		return decks;
	}

	public void setDecks(LinkedList<DeckDao> decks) {
		this.decks = decks;
	}
}

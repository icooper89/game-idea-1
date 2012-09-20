package com.icooper.buttercho.persistance.mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.icooper.buttercho.persistance.dao.*;
import com.icooper.buttercho.persistance.dao.user.UserDao;

/**
 * Service layer to the database.
 * 
 * @author Nicholas Leong
 *
 */
public class MongoInterface {
	
	private enum Collection {
		USER,
		CARD
	}
	
	private static MongoInterface instance = null;
	
	@Autowired
	private MongoOperations mongoOperations = null; 
	
	/**
	 * Keep the constructor private to enforce the Singleton pattern
	 */
	private MongoInterface() {
    	ApplicationContext ctx = new GenericXmlApplicationContext("mongo-config.xml");
 
    	this.mongoOperations = (MongoOperations)ctx.getBean("butterchoMongoDB");
	}
	
	public static MongoInterface getConnection() {
		if(instance == null)
			instance = new MongoInterface();
		
		return instance;
	}
	
	public static void destroyConnection() {
		instance = null;
	}
	
	public boolean saveUser(UserDao user) {
		// TODO
		return false;
	}
	
	
	public boolean insertUser(UserDao user) {
		// TODO
		return false;
	}
	
	public UserDao retrieveUser(String id) {
		// TODO
		return null;
	}
}

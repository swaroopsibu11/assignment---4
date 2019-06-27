package com.evry.rest.messenger.database;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.evry.rest.messenger.model.Message;

public class DatabaseClass {
    
	private static Map<Long,Message> messages = new HashMap<Long,Message>();
	
	public static Map<Long,Message> getMessages(){
		return messages;
	}
}

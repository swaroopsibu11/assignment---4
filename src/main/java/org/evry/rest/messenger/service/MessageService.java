package org.evry.rest.messenger.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.evry.rest.messenger.model.Message;

import com.evry.rest.messenger.database.DatabaseClass;

public class MessageService {

	private Map<Long, Message> messages = DatabaseClass.getMessages();

	public MessageService() {

		messages.put(1L, new Message(1, "Wecome to RestFul Webservices", "Swaroop"));
		messages.put(2L, new Message(2, "JAX-RS Api used for Webservices", "Sateesh"));
	}

	public List<Message> getMessages() {
		//List<Message> mes = new ArrayList<Message>();
		return new ArrayList<Message>(messages.values());
	}

	public Message getMessage(long id) {

		return messages.get(id);
	}

	public Message addMessage(Message message) {

		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
		return message;

	}

	public Message updateMessage(Message message) {

		if (message.getId() <= 0) {
			return null;
		} else
			messages.put(message.getId(), message);
		return message;

	}

	public Message removeMessage(long id) {

		return messages.remove(id);
	}
}

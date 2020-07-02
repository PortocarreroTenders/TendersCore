package com.itenderspro.model;

import java.util.ArrayList;
import java.util.HashMap;

public class Tender {
	public HashMap<?, ?> getProperties() {
		return properties;
	}
	public void setProperties(HashMap<?, ?> properties) {
		this.properties = properties;
	}
	public ArrayList<?> getDocuments() {
		return documents;
	}
	public void setDocuments(ArrayList<?> documents) {
		this.documents = documents;
	}
	private HashMap<?, ?> properties;
	private ArrayList<?> documents;

}

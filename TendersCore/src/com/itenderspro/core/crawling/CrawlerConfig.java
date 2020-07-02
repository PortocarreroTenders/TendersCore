package com.itenderspro.core.crawling;

import java.util.HashMap;

public class CrawlerConfig {
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCaseFolder() {
		return caseFolder;
	}
	public void setCaseFolder(String caseFolder) {
		this.caseFolder = caseFolder;
	}
	public String getCrawlerClass() {
		return crawlerClass;
	}
	public void setCrawlerClass(String crawlerClass) {
		this.crawlerClass = crawlerClass;
	}
	public HashMap<?, ?> getProperties() {
		return properties;
	}
	public void setProperties(HashMap<?, ?> properties) {
		this.properties = properties;
	}
	private String name;
	private String caseFolder;
	private String crawlerClass;
	private HashMap<?, ?> properties;

}

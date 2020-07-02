package com.itenderspro.core.crawling;

public interface ICrawler {
	void execute(CrawlerConfig config);
	void persist();
	
}

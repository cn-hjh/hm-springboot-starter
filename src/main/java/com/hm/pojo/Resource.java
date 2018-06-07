package com.hm.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration //代表这段会应用资源文件
@ConfigurationProperties(prefix="com.hm.opensource")//前缀，会映射到字段里   com.hm.opensource.name
@PropertySource(value="classpath:resource.properties") //资源文件地址
public class Resource {
	private String name;
	private String website;
	private String language;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
}

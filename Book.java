package com.mapping.collection.set;

import java.util.Set;

public class Book {
	private Integer bk_id;
	private String bk_name;
	private String publisher;
	private Set<String> authors;
	//constructor getter setter tostring
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getBk_id() {
		return bk_id;
	}
	public void setBk_id(Integer bk_id) {
		this.bk_id = bk_id;
	}
	public String getBk_name() {
		return bk_name;
	}
	public void setBk_name(String bk_name) {
		this.bk_name = bk_name;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Set<String> getAuthors() {
		return authors;
	}
	public void setAuthors(Set<String> authors) {
		this.authors = authors;
	}
	@Override
	public String toString() {
		return "Book [bk_id=" + bk_id + ", bk_name=" + bk_name + ", publisher=" + publisher + ", authors=" + authors
				+ "]";
	}
	

}

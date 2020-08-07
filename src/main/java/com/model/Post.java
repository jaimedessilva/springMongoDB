package com.model;

import java.io.Serializable;
import java.util.Date;

/**Project: springMongoDB
 * File: Post.java
 * @author jaime
 * Em 06-08-2020 **/

public class Post implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String id;
	private Date date;
	private String title;
	private String body;
	private User author;
	
	/*
	 * Construct
	 */
	public Post() {}

	/*
	 * Construct
	 */
	public Post(String id, Date date, String title, String body, User author) {
		this.id = id;
		this.date = date;
		this.title = title;
		this.body = body;
		this.author = author;
	}

	/* Getter */
	public String getId() {
		return id;
	}

	/* Setter */
	public void setId(String id) {
		this.id = id;
	}

	/* Getter */
	public Date getDate() {
		return date;
	}

	/* Setter */
	public void setDate(Date date) {
		this.date = date;
	}

	/* Getter */
	public String getTitle() {
		return title;
	}

	/* Setter */
	public void setTitle(String title) {
		this.title = title;
	}

	/* Getter */
	public String getBody() {
		return body;
	}

	/* Setter */
	public void setBody(String body) {
		this.body = body;
	}

	/* Getter */
	public User getAuthor() {
		return author;
	}

	/* Setter */
	public void setAuthor(User author) {
		this.author = author;
	}
}

package com.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**Project: springMongo
 * File: User.java
 * @author jaime
 * Em 05-08-2020 **/

@Document
public class User implements Serializable {
		
	private static final long serialVersionUID = 1L;
	@Id
	private String id; 
	private String nome;
	private String email;
	@DBRef (lazy = true)
	private List<Post> posts = new ArrayList<>();
	/*
	 * Construct
	 */
	public User() {}
	/*
	 * Construct
	 */
	public User(String id, String nome, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
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
	public String getNome() {
		return nome;
	}
	/* Setter */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/* Getter */
	public String getEmail() {
		return email;
	}
	/* Setter */
	public void setEmail(String email) {
		this.email = email;
	}
	/* Getter */
	public List<Post> getPosts() {
		return posts;
	}
	/* Setter */
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
}

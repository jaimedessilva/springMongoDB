package com.model;

import java.io.Serializable;

/**Project: springMongo
 * File: User.java
 * @author jaime
 * Em 05-08-2020 **/

public class User implements Serializable {
		
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String nome;
	private String email;
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
}

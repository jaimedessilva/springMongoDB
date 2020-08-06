package com.model;

import java.io.Serializable;

/**Project: springMongoDB
 * File: UserDTO.java
 * @author jaime
 * Em 05-08-2020 **/

public class UserDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String id; 
	private String nome;
	private String email;
	/*
	 * Construct
	 */
	public UserDTO(User obj) {
		setId(obj.getId());
		setNome(obj.getNome());
		setEmail(obj.getEmail());
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

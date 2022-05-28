package com.me.portalchamados.resources.exceptions;

import java.io.Serializable;

public class FieldMessage implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String fildname;
	private String message;
	
	public FieldMessage() {
		super();
	}

	public FieldMessage(String fildname, String message) {
		super();
		this.fildname = fildname;
		this.message = message;
	}

	public String getFildname() {
		return fildname;
	}

	public void setFildname(String fildname) {
		this.fildname = fildname;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}

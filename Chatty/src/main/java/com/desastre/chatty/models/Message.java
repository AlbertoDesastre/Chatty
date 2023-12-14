package com.desastre.chatty.models;

public class Message {
	private String id;
	private String content;
	private String contentType;

	public Message(String id, String content, String contentType) {
		super();
		this.id = id;
		this.content = content;
		this.contentType = contentType;
	}

	public String getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

	public String getContentType() {
		return contentType;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
}

package com.desastre.chatty.models;

public class GroupChat {
	private String id;
	private String name;
	private String picture;
	private String description;

	public GroupChat() {
	}

	public GroupChat(String id, String name, String picture, String description) {
		this.id = id;
		this.name = name;
		this.picture = picture;
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}

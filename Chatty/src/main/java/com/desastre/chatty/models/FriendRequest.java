package com.desastre.chatty.models;

import java.util.Date;

public class FriendRequest {
	private String sentByUserId;
	private String requestedUserId;
	private String message;
	private Date sentDate;

	public FriendRequest() {
	}

	public FriendRequest(String sentByUserId, String requestedUserId, String message, Date sentDate) {
		this.sentByUserId = sentByUserId;
		this.requestedUserId = requestedUserId;
		this.message = message;
		this.sentDate = sentDate;
	}

	public String getSentByUserId() {
		return sentByUserId;
	}

	public void setSentByUserId(String sentByUserId) {
		this.sentByUserId = sentByUserId;
	}

	public String getRequestedUserId() {
		return requestedUserId;
	}

	public void setRequestedUserId(String requestedUserId) {
		this.requestedUserId = requestedUserId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {

		this.message = message;
	}

	public Date getSentDate() {
		return sentDate;
	}

	public void setSentDate(Date sentDate) {
		this.sentDate = sentDate;
	}
}

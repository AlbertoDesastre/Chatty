package com.desastre.chatty.models;

public class GroupChatParticipation {
	private String userA;
	private String userB;

	public GroupChatParticipation(String userA, String userB) {
		super();
		this.userA = userA;
		this.userB = userB;
	}

	public String getUserA() {
		return userA;
	}

	public String getUserB() {
		return userB;
	}

	public void setUserA(String userA) {
		this.userA = userA;
	}

	public void setUserB(String userB) {
		this.userB = userB;
	}

}

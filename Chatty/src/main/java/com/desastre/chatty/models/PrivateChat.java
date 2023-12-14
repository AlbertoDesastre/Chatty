package com.desastre.chatty.models;

public class PrivateChat {
	private String UserAId;
	private String UserBId;

	public PrivateChat(String userAId, String userBId) {
		super();
		UserAId = userAId;
		UserBId = userBId;
	}

	public String getUserAId() {
		return UserAId;
	}

	public String getUserBId() {
		return UserBId;
	}

	public void setUserAId(String userAId) {
		UserAId = userAId;
	}

	public void setUserBId(String userBId) {
		UserBId = userBId;
	}

}

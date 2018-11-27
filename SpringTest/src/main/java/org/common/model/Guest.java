package org.common.model;

public class Guest {

	private int guestId;
	private String guestName;

	public int getGuestId() {
		return guestId;
	}

	public void setGuestId(int guestId) {
		this.guestId = guestId;
	}

	public String getGuestName() {
		return guestName;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	@Override
	public String toString() {
		return "Guest [guestId=" + guestId + ", guestName=" + guestName + "]";
	}

}

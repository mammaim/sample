package com.hw.action;

import java.io.Serializable;

/**
 * @author mammaim
 * 
 */
public class Deal implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String dealId;
	private int intresetId;
	private String fromUser;
	private String ToUser;
	public String getDealId() {
		return dealId;
	}
	public void setDealId(String dealId) {
		this.dealId = dealId;
	}
	public int getIntresetId() {
		return intresetId;
	}
	public void setIntresetId(int intresetId) {
		this.intresetId = intresetId;
	}
	public String getFromUser() {
		return fromUser;
	}
	public void setFromUser(String fromUser) {
		this.fromUser = fromUser;
	}
	public String getToUser() {
		return ToUser;
	}
	public void setToUser(String toUser) {
		ToUser = toUser;
	}
	
}

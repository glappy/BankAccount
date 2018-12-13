package com.biz.bank.vo;

public class BankVO_01 {

	private String strId;
	private int intBalance;
	private String strLastDate; // 정보의 은닉. getter setter를 통해서만 접근하도록 한 것. 캡슐화

	public String getStrId() {
		return strId;
	}

	public void setStrId(String strId) {
		this.strId = strId;
	}

	public int getIntBalance() {
		return intBalance;
	}

	public void setIntBalance(int intBalance) {
		this.intBalance = intBalance;
	}

	public String getStrLastDate() {
		return strLastDate;
	}

	public void setStrLastDate(String strLastDate) {
		this.strLastDate = strLastDate;
	}

	@Override
	public String toString() {
		return "BankVO_01 [strId=" + strId + ", intBalance=" + intBalance + ", strLastDate=" + strLastDate + "]";
	}

}

package com.biz.bank.vo;

public class BankVO {

	String strNum;
	int intMoney;
	String strDate;

	public String getStrNum() {
		return strNum;
	}

	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}

	public int getIntMoney() {
		return intMoney;
	}

	public void setIntMoney(int intMoney) {
		this.intMoney = intMoney;
	}

	public String getStrDate() {
		return strDate;
	}

	public void setStrDate(String strDate) {
		this.strDate = strDate;
	}

	@Override
	public String toString() {
		return "BankVO [strNum=" + strNum + ", intMoney=" + intMoney + ", strDate=" + strDate + "]";
	}



}

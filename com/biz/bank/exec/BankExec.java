package com.biz.bank.exec;

import com.biz.bank.service.BankService;

public class BankExec {

	public static void main(String[] args) {
		BankService bs = new BankService();
		bs.readFile();
		bs.bankInput();
		
		
	}
}

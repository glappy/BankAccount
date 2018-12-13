
package com.biz.bank.exec;

import com.biz.bank.service.BankService_02;

public class BankExec01_02 {

	public static void main(String[] args) {
		String strFileName = "src/com/biz/bank/bankBalance.txt";
		BankService_02 bs = new BankService_02(strFileName);
		bs.readFile();
		bs.bankInput();
		
		
	}

}
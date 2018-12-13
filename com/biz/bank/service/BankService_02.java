
package com.biz.bank.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.bank.vo.BankVO_02;

public class BankService_02 {

	List<BankVO_02> bankList;
	String strFileName;

	public BankService_02(String strFileName) {
		this.bankList = new ArrayList();
		this.strFileName = strFileName;
	}

	public void readFile() {
		FileReader fr;
		BufferedReader buffer;

		try {
			fr = new FileReader(this.strFileName);
			buffer = new BufferedReader(fr);

			while (true) {
				String line = buffer.readLine();
				if (line == null)
					break;
				System.out.println(line);

				String[] sLine = line.split(":");
				BankVO_02 vo = new BankVO_02();
				vo.setStrId(sLine[0]);
				vo.setIntBalance(Integer.valueOf(sLine[1]));
				vo.setStrLastDate(sLine[2]);
				bankList.add(vo);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public BankVO_02 findId(String strId) {
		for (BankVO_02 vo : bankList) {
			String id = vo.getStrId();
			if (id.equals(strId)) {
				System.out.println(vo);
				return vo;
			}
		}
		return null;
	}

	public void bankInput() {
		System.out.println("-------------------------------");
		System.out.println("계좌를 입력하세요 >> ");
		Scanner scan = new Scanner(System.in);
		String accId = scan.nextLine();

		BankVO_02 b = findId(accId);
		if (b == null) {
			System.out.println("계좌번호 없음");
			return;
		}
		
		int iB = b.getIntBalance();
		System.out.println("입금액 >> ");
		String strB = scan.nextLine();
		int intB = Integer.valueOf(strB);
		int lB = iB + intB;
		b.setIntBalance(lB);
		System.out.println("입금완료");
	}

}

package com.biz.bank.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.bank.vo.BankVO;

public class BankService {
	List<BankVO> bankList;

	public void readFile() {
		bankList = new ArrayList();

		String file = "src/com/biz/bank/bankBalance.txt";

		FileReader fr;
		BufferedReader buffer;

		try {
			fr = new FileReader(file);
			buffer = new BufferedReader(fr);
			while (true) {
				String line = buffer.readLine();
				if (line == null)
					break;
				String[] cut = line.split(":");

				BankVO vo = new BankVO();
				vo.setStrNum(cut[0]);
				vo.setIntMoney(Integer.valueOf(cut[1]));
				vo.setStrDate(cut[2]);
				bankList.add(vo);

			}

			buffer.close();
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void bankInput() {

		Scanner scan = new Scanner(System.in);

		System.out.println("입출금 여부>> ");
		String inout = scan.nextLine();
		System.out.println("계좌번호>> ");
		String num = scan.nextLine();
		System.out.println("입출금금액>> ");
		String in = scan.nextLine();

		int bLen = bankList.size();
		for (int i = 0; i < bLen; i++) {
			BankVO vo = bankList.get(i);

			if (inout.equals("입금") && num.equals(vo.getStrNum())) {
				vo.setIntMoney(vo.getIntMoney() + Integer.valueOf(in));
//				cut = Integer.valueOf(vo.getIntMoney());
//				cut += Integer.valueOf(in);
			} else {
				break;
			}
			
			if (inout.equals("출금") && num.equals(vo.getStrNum())) {
				vo.setIntMoney(vo.getIntMoney() - Integer.valueOf(in));
				if (vo.getIntMoney() >= 0) {
					System.out.println("현재 잔액 : " + vo.getIntMoney());
				} else {
					System.out.println("잔고가 부족합니다");
					break;
				}
			}
//				cut = Integer.valueOf(vo.getIntMoney());
//				cut += Integer.valueOf(in);
		}

		// System.out.println(cut);

	}

}

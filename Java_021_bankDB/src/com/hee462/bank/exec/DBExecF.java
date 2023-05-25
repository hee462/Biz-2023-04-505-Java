package com.hee462.bank.exec;

import com.hee462.bank.service.BankService;

public class DBExecF {
	public static void main(String[] args) {
		BankService bService = new BankService();
		bService.findUserInfo();
		bService.insertAccList();
		
	}
	
}

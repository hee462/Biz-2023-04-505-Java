package com.hee462.bank.exec;

import com.hee462.bank.service.BankService;

public class DBExecD {
	public static void main(String[] args) {
		BankService bankService = new BankService();
		bankService.printBuyerList();
		bankService.findByBuyer();
	}
}	

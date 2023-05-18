package java_020_bank.service;


import java.io.PrintWriter;

import java_020_bank.model.BuyerDto;

public interface BuyerService {
	public void loadBuyer();
	public void printBuyerList();
	public void printBuyerList(PrintWriter out);
	
	public BuyerDto gerBuyer(String buId);
	public void inputBuyer();
}

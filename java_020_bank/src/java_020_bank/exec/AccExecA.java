package java_020_bank.exec;

import java_020_bank.service.AccService;
import java_020_bank.service.impl.AccServiceImplV2;

public class AccExecA {
	public static void main(String[] args) {
		AccService aService = new AccServiceImplV2();
		aService.accInit();
	}
}

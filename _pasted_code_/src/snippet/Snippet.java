package snippet;

public class Snippet {
	System.out.printf("계좌번호 >>> %s\n",accDto.acNum);
				System.out.print("계좌구분[1.입출금 2.적금 3.대출](1~3 입력) >>> ");
				String strDiv = scan.nextLine();
				System.out.printf("잔액(기본:10000원) >>> ");
				String strBalance = scan.nextLine();
				if(strBalance.equals("")) { strBalance = "10000"; }
				System.out.println("=".repeat(100));
				accDto.acBuId    = strId;
				accDto.acDiv     = strDiv;
				accDto.acBalance = Integer.valueOf(strBalance);
				int result = accService.insert(accDto);
				
				if(result > 0) {
					System.out.println("=".repeat(100));
					System.out.println();
					System.out.println("계좌생성을 완료했습니다");
					System.out.println();
					System.out.println("=".repeat(100));
					
				}
}


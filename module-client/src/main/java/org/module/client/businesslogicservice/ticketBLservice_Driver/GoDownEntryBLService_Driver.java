package org.module.client.businesslogicservice.ticketBLservice_Driver;

import org.module.client.businesslogicservice.ticketBLservice.GoDownEntryBLService;
import org.module.client.vo.GoDownEntryVO;


public class GoDownEntryBLService_Driver {
	public void drive(GoDownEntryBLService goDownEntryBLService){
		GoDownEntryVO d=new GoDownEntryVO("courier","date", "destination",
				"qu", "pai","jia", "wei");
		boolean creat=goDownEntryBLService.createTicket("courier","date", "destination",
				"qu", "pai","jia", "wei");
		if(creat)
			System.out.println("creat successfully!");
		
		
	}
}

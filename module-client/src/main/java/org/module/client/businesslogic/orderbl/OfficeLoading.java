package org.module.client.businesslogic.orderbl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import org.module.client.businesslogicservice.order.OfficeLoadingService;
import org.module.client.javaRMI.RmiClient;
import org.module.client.main.Main;
import org.module.client.vo.OfficeLoadingListVO;
import org.module.common.dataservice.orderdataservice.OfficeLoadingListService;
import org.module.common.po.OfficeLoadingListPO;

public class OfficeLoading implements OfficeLoadingService {
	private OfficeLoadingListService officeLoadingData ;
	public OfficeLoading() {
		officeLoadingData = new RmiClient().get(OfficeLoadingListService.class);
	}
	public boolean creat(OfficeLoadingListVO o) {
		OfficeLoadingListPO newPO = o.toPO(); 
		try {
			 System.out.println("creat");
			return officeLoadingData.add(newPO);
		} catch (RemoteException e) {
			e.printStackTrace();
			return false;
		}
	}

	
	public boolean update(OfficeLoadingListVO o){
		OfficeLoadingListPO newPO = o.toPO(); 
		try {
			return officeLoadingData.update(newPO);
		} catch (RemoteException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public ArrayList<OfficeLoadingListVO> getAll() {
		ArrayList<OfficeLoadingListVO> newVOs = new ArrayList<OfficeLoadingListVO>();
		ArrayList<OfficeLoadingListPO> POs = null;
		try {
			 POs = officeLoadingData.getAll(Main.currentUser.getId());
			 for(int i =0;i<POs.size();i++){
					newVOs.add(new OfficeLoadingListVO(POs.get(i)));
			 }
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return newVOs;
	}

}

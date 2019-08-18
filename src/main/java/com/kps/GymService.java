package com.kps;

import java.util.HashMap;

public class GymService {
	
	HashMap<Integer,Centre> map = new HashMap<Integer,Centre>();
	
	public void addCentre(Centre centre) {
		map.put(centre.id,centre);
	}
	
	boolean isSlotAvailable(String date,int CentreId, SlotId slotId) {
		Centre centre = map.get(CentreId);
		return centre.isAvailableSlot(slotId);
	}
	
	public boolean addUser(User user,int centreId,SlotId sid) {
		user.slotId = sid;
		user.centreId = centreId;
		
		Centre centre = map.get(centreId);
		return centre.addUser(user,sid);
	}
	
	public void view(int cid) {
		Centre centre = map.get(cid);
		centre.view();
	}
	public void viewUser(String name) {
		for(int cid:map.keySet()) {
			Centre centre = map.get(cid);
			User user = centre.haveUser(name);
			System.out.println("map size:: "+map.size());
			if(user!=null) {
				System.out.println("User:: "+user.name+" slotid: "+user.slotId+" "+user.centreId);
				//break;
			}
		}
	}
}

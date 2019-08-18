package com.kps;

import java.util.HashMap;

public class Centre {
	int id;
	String name;
	HashMap<SlotId,Slot> map = new HashMap<SlotId,Slot>();
	
	public Centre(int id1,String name1) {
		name = name1;
		id=id1;
		map.put(SlotId.Morning1, new Slot(2,SlotId.Morning1));
		map.put(SlotId.Morning2, new Slot(100,SlotId.Morning2));
		map.put(SlotId.Morning3, new Slot(100,SlotId.Morning3));
		map.put(SlotId.Evening1, new Slot(100,SlotId.Evening1));
		map.put(SlotId.Evening2, new Slot(100,SlotId.Evening2));
		map.put(SlotId.Evening3, new Slot(100,SlotId.Evening3));
	}
	
	public boolean isAvailableSlot(SlotId slotId) {
		Slot slot = map.get(slotId);
		return slot.isAvalable();
	}

	public boolean addUser(User user, SlotId sid) {
		Slot slot = map.get(sid);
		return slot.addUser(user);
	}
	
	public void view() {
		for(SlotId slotId:map.keySet()) {
			Slot slot = map.get(slotId);
			System.out.println("Slot ID = "+slotId);
			slot.view();
		}
	}
	
	public User haveUser(String name) {
		for(SlotId cid:map.keySet()) {
			Slot slot = map.get(cid);
			User user = slot.haveUser(name);
			if(user!=null) {
				return user;
			}
		}
		return null;
	}
	
}

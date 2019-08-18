package com.kps;

import java.util.HashMap;

public class Slot {
	HashMap<String,User> map = new HashMap<String,User>();
	int capacity;
	int currentCount;
	SlotId id;
	public Slot(int c,SlotId id1) {
		capacity = c;
		id=id1;
	}
	
	boolean isAvalable() {
		return currentCount<capacity;
	}

	public boolean addUser(User user) {
		if(isAvalable()) {
			map.put(user.name,user);
			currentCount++;
			return true;
		}else {
			return false;
		}
	}
	
	public void view() {
		for(String name:map.keySet()) {
			User user = map.get(name);
			System.out.println("Name: "+name+" Age: "+user.age+" CentreId:"+user.centreId+" Slot:"+user.slotId);
		}
	}
	
	User haveUser(String name ) {
		if(map.containsKey(name))
			return map.get(name);
		return null;
	}
}

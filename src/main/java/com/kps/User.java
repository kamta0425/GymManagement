package com.kps;

public class User {
	public String name;
	public int age;
	public int centreId;
	public SlotId slotId;
	
	public User(String name1,int age1) {
		name = name1;
		age = age1;
	}
	
	public User(String name1,int age1,int centreId1, SlotId slotId1) {
		name = name1;
		age = age1;
		centreId = centreId1;
		slotId = slotId1;
	}
	
}

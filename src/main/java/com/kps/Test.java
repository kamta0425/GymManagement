package com.kps;

import java.util.Scanner;

public class Test {
	
	public static final int WEIGHTS = 1;
	public static final int CARDIO = 2;
	
	static GymService service =new GymService();
	
	public static void main(String[] args) {	
		
		service.addCentre(new Centre(1,"Koramangala"));
		service.addCentre(new Centre(2,"Bellandur"));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1:Register User		2:View Workout		3:Book Workout		4:View Plan 	5:Add Centre 	6:Exit");
		while(true) {
			int id = sc.nextInt();
			if(id==6)break;
			switch(id) {
				case 1:
					registerUser(sc);
					break;
					
				case 2:
					System.out.println("Enter:: CentreID Name");
					int cid = sc.nextInt();
					service.view(cid);
					break;
					
				case 3:
					break;
					
				case 4:
					System.out.println("Enter:: User Name");
					String name = sc.next();
					service.viewUser(name);
					break;
					
				case 5:
					System.out.println("Enter:: CentreID Name");
					int cid1 = sc.nextInt();
					String name1 = sc.next();
					service.addCentre(new Centre(cid1,name1));
					break;
					
				default:
					break;
			}
		}
		System.out.println("Programme End");
	}
	
	static void registerUser(Scanner sc) {
		System.out.println("Enter:: Name Age CentreId SlotId");
		String name = sc.next();
		int age = sc.nextInt();
		int centreId = sc.nextInt();
		int slotId = sc.nextInt();
		boolean res = service.addUser(new User(name,age), centreId ,SlotId.Morning2);
		if(res) System.out.println("Success!");
		else System.out.println("Failed!");
	}
	

}

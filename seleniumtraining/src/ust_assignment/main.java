package ust_assignment;

import java.util.Scanner;

public class main {
	
	//public Double balance;
	//public Double revenue=0.00;
	
	public void mainMethod() {
		
		System.out.println("Main Class");
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the option 1 or 2: ");
		int one=sc.nextInt();
		int two=sc.nextInt();
		int a=1;
		int b=2;
		//System.out.println(" Option 1: "+one);
		//System.out.println(" Option 2: "+two);
		if(one==a) {
			int exhibitionSeats= sc.nextInt();
			System.out.println("Enter no of Seats in Exhibtion="+exhibitionSeats);
			String exhibitionName=sc.next(); 
			System.out.println("Enter Exhibtion Name="+exhibitionName);
			revenueDetails rv=new revenueDetails();
			Double s=rv.getExhibitionRevenue(exhibitionSeats, rv.getMinibalance());
			System.out.println("Exhibition revenue==> "+s);
		}else if(two==b) {
			int stagenvent=sc.nextInt();
			
			System.out.println("Enter no of Seats in StageEvent="+stagenvent);
			String eventName=sc.next(); 
			System.out.println("Enter Event Name="+eventName);
			revenueDetails rv=new revenueDetails();
			Double stgRevenue=rv.getStageRevenue(stagenvent, rv.getMinibalance());
			System.out.println("Stage Event revenue==> "+stgRevenue);
		}
		
			
	}
	
	public static void main(String arg[]) {
		main m=new main();
		
			m.mainMethod();	
		
	}

}

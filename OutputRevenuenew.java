package com.hackercode.utilities;

public class OutputRevenue {
	public void writeOutput(Car car[]){
		int totalRevenue=0;
		for(int i=0;i<car.length;i++){
			totalRevenue+=car[i].getRevenue();
		}
		System.out.println("total Revenue="+totalRevenue);
		
	}
}

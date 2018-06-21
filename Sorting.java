package com.hackercode.utilities;

public class Sorting {
	public Request r;

	public void sort(Request[] req){
		r= new Request();
		
		
		for(int i =0 ;i<20;i++){
			
			for(int j=i+1;j<20;j++){
			
				if(req[i].getEndtime()>req[j].getEndtime()){
				 r= req[i];
				 req[i]=req[j];
				 req[j]=r;
					
					
				}
					
				
			}
		
	}
		

	}}

package com.hackercode.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.hackercode.utilities.Dijkastras;
import com.hackercode.utilities.OutputRevenue;
import com.hackercode.utilities.ReadInput;
import com.hackercode.utilities.Scheduling;
import com.hackercode.utilities.SortRequest;

public class Driver {
	public static void main(String []args) throws IOException{
		ReadInput ri=new ReadInput();
		ri.reading();
		OutputRevenue o=new OutputRevenue();
		SortRequest so=new SortRequest();
		so.sort(ri.getReq());
		 Dijkastras di=new Dijkastras();
		for(int i=0;i<ri.getN();i++){
			 di.dij(ri.getLocation(),ri.getN(),i);
		 }
		Scheduling s=new Scheduling();
		
		s.schedule(ri.getCar(),ri.getReq(),ri.getLocation());
		
		o.writeOutput(ri.getCar());
	}
}

package com.hackercode.utilities;
import java.util.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadInput {

	public int getN() {
		return N;
	}

	public void setN(int n) {
		N = n;
	}
	public int getn() {
		return n;
	}
	public void setn(int n) {
		this.n=n;
	}
	private int n,N,c,R;
	public int getC() {
		return c;
	}

	public int getR() {
		return R;
	}

	public void setC(int c) {
		this.c = c;
	}

	public void setR(int r) {
		R = r;
	}
	private int[][] location;
	public int[][] getLocation() {
		return location;
	}

	public void setLocation(int[][] location) {
		this.location = location;
	}

	private Car[] car;
	private Request[] request;
	
	public Car[] getCar() {
		//System.out.println(car.length);
			return car;
		
	}

	public Request[] getRequest() {
		return request;
	}

	public void setCar(Car[] car) {
		this.car = car;
	}

	public void setRequest(Request[] request) {
		this.request = request;
	}

		public void Read(int n,int N ,int c,int R)throws IOException{
			
			
			try{
				Scanner sc = new Scanner(new File("F:\\vicky\\input.txt"));
					
				n=sc.nextInt();
				N=sc.nextInt();
				c=sc.nextInt();
				R=sc.nextInt();
				
				System.out.print("location\t" +n +"\tvehicle\t" +N + "\tcapacity\t" +c+ "\trequest\t"+R);
				location = new int[n][n];
				
				for(int i =0 ;i<n;i++){
					for(int j=0;j<n;j++){
					location[i][j]=sc.nextInt();
					if(location[i][j]==-1) {
						location[i][j]=999;
					}
					}
				}
				car = new Car[N];
				for(int i=0;i<N;i++) {
					car[i]=new Car();
				}
						for(int i=0;i<N;i++){
					car[i].setLocation(sc.nextInt());
					
				}
				request = new Request[R];
				for(int i=0;i<R;i++) {
					request[i]= new Request();
				}
				
				for(int i=0;i<R;i++){
					request[i].setSrc(sc.nextInt());
					request[i].setDes(sc.nextInt());
					request[i].setStartme(sc.nextInt());
					request[i].setEndtime(sc.nextInt());
				
				}
			}catch(Exception e){
					System.out.println(e.getLocalizedMessage());
				}
		}
}

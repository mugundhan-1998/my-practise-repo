package com.java.inheritance;

public class MercedesBenz extends Car{

	public void engine(){
		System.out.println("Whenever engine is called, i supply power to child");
	}
	
	public void gearbox(int a){
		System.out.println("Whenever gear is called, i increase or decrease the torque");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car benz = new MercedesBenz();

	     System.out.println("The number of wheels is "+ benz.wheels);
	     benz.engine();
	   //  benz.gearbox(3);
	}

}

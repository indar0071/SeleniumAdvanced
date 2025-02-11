package com.test;

public class Honda4 extends Bike {
	void run(){
		System.out.println("running safely");
		}  
	public static void main(String[] args) {
		
		Bike obj = new Honda4();
		obj.changedGear();
		 obj.run();  

	}

}

abstract class Bike{  
	 public Bike() {
		System.out.println("Bike abstruct cunstructor call -- bike is create");
	}
	  abstract void run();  
	  void changedGear() {
		  System.out.println("Gear changed");
	  }
	}  

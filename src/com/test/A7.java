package com.test;

interface Printable{  
void print();  
}  
abstract class Showable{  
void print() {
	System.out.println("showable class");
};  
}  
class A7 extends Showable implements Printable{  
 
//public void show(){System.out.println("Welcome");}  
public void print(){System.out.println("Hello");} 
  
public static void main(String args[]){  
A7 obj = new A7();  
Showable abj1=new A7();

obj.print();  
abj1.print();
 
//obj.show();  
 }  
}  
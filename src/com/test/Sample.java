package com.test;

public class Sample {

	public static void main(String[] args) {
		System.out.println("test");
		byte b=5;
		short s=6;
		int i=10;
		int a=11;
		float f=45.54f;
		long l=1232222;
		double d=343.34333;
		char c='a';
		boolean t = false;
		System.out.println("byte " +b);
		System.out.println("int " + (++i));
		System.out.println( (i>=a)==t);
		System.out.println( f);
		System.out.println( a%i);
		if(i<a)
		{
			System.out.println("i is greater then a");
		} else if (i==a) {
			System.out.println("i is equal to a");
		}
		
        boolean b1= true, b2=false;
        System.out.println("!  (b1 && b2) is: " + ! (b1 && b2 )); //True
        System.out.println("(b1 && b2) is: " + (b1 && b2 )); //False
        System.out.println("(b1 || b2) is: " + (b1 || b2 )); //True
        
        System.out.println("Switch case test----------");
         char grade = 'X';
        
        switch (grade){
        
        case 'A':
            System.out.println ("Excellent");
            break;
        case 'B':
            System.out.println ("Well Done");
            break;
            
        case 'C':
            System.out.println ("Better");
            break;
        default:
            System.out.println("Invalid Grade");
                }
    

	}

}

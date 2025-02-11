package com.test;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListtest {

	public static void main(String[] args) {

    ArrayList<Object> arrlist=new ArrayList<Object>();
     arrlist.add("Indar");
     arrlist.add(1233);
     arrlist.add('d');
     Iterator<Object> itr= arrlist.iterator();
 while(itr.hasNext()) {
	 System.out.println(itr.next());
	 
 }
   
	}

}

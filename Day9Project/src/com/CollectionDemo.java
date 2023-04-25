package com;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CollectionDemo {
	
	public static void main(String[] args) {
		List<String> li=new ArrayList<String>();
		
		li.add("Moulika");
		li.add("14");
		li.add("false");
		li.add(new Date().toString());

		System.out.println(li.size());
		System.out.println(li);
		li.add("Saad");
		System.out.println(li.size());
		System.out.println(li);
		li.remove(1);
		li.remove(3);
		System.out.println(li.size());
		System.out.println(li);
	}

}


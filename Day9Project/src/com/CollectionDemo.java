package com;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

class ConsumerDemo implements Consumer<String>{

	@Override
	public void accept(String t) {
		System.out.println(t);		
	}
	
}
public class CollectionDemo {
	
	public static void main(String[] args) {
		List<String> li=new ArrayList<String>();
		
		li.add("Moulika");
		li.add("Amit");
		li.add("Mark");
		li.add("Andrew");
		li.add("Saurabh");
		li.add("Ajay");
		
		/*
		 * for(String s:li) { if(s.startsWith("A")) System.out.println(s); }
		 */
		Stream<String> s=li.stream();
		//s.forEach(str->System.out.println(str));
		Consumer<String> c=(str)->System.out.println(str.toUpperCase());
		s.forEach(c);
		
	}

}


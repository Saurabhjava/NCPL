package org;

import java.util.function.Predicate;

class MyTest implements Predicate<String> {
	
	@Override
	public boolean test(String str) {
		if(str.startsWith("A"))
			return true;
		else
			return false;
	}
	
}
public class PrdicateDemo {

	public static void main(String[] args) {
		String names[]= {"Arvind","Rahul","Mounika","Amit","Neeraj","Atul"};
		MyTest obj=new MyTest();
		for(String s:names) {
			if(obj.test(s))
				System.out.println(s);
		}

	}

}

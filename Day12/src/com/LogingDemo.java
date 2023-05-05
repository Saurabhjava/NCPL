package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogingDemo {
	
	static Logger log=LoggerFactory.getLogger(LogingDemo.class);
	public static void main(String[] args) {	
		String serverName="Tomcat";
		int port=8080;
		log.info("My {} Server is running on port {}",serverName,port);
		System.out.println("Hi This is Info Message");
	}

}

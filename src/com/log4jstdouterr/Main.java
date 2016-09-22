package com.log4jstdouterr;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.IOException;
import java.io.PrintStream;

public class Main {

	static Logger logger = Logger.getLogger(Main.class);

	public static void main (String[] args) throws IOException {
        StdouterrConfigurator.stdconfigure(System.getProperty("java.util.logging.config.file"));
		try {
            System.out.println("this is an exception.");
            int a = 10/0;
		} catch(ArithmeticException e) {
            e.printStackTrace();
		}
		System.err.println("sivagnanam");
		logger.debug("this is a debug log message");
		logger.info("this is a information log message");
		logger.warn("this is a warning log message");
        System.out.println("It is working.");
	}
} 

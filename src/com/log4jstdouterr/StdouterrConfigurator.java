package com.log4jstdouterr;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by siva-2356 on 14/9/16.
 */
public class StdouterrConfigurator extends PropertyConfigurator {

    public StdouterrConfigurator(String conf) throws IOException {
        setstd();
        super.configure(conf);
    }

    public static void stdconfigure(String conf) throws IOException {
        new StdouterrConfigurator(conf);
    }

    public static void setstd() {
        Logger logger = Logger.getLogger("stderr");
        LoggingOutputStream los = new LoggingOutputStream(logger, CustomLevel.STDERR);
        Logger logger1 = Logger.getLogger("stdout");
        LoggingOutputStream los1 = new LoggingOutputStream(logger1, CustomLevel.STDOUT);
	    System.setOut(outputFile(los1));
	    System.setErr(outputFile(los));
    }

    protected static PrintStream outputFile(LoggingOutputStream name) {
        return new PrintStream(name, true);
    }
}

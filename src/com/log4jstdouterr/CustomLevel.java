package com.log4jstdouterr;

import org.apache.log4j.Level;

/**
 * Created by siva-2356 on 14/9/16.
 */

/**
 * Created by siva-2356 on 14/9/16.
 */

public class CustomLevel extends Level {

    private CustomLevel(int name, String value, int sys) {
        super(name, value, sys);
    }

    public static Level STDOUT = new CustomLevel(50, "STDOUT", 6);

    public static Level STDERR = new CustomLevel(51, "STDERR", 3);
}

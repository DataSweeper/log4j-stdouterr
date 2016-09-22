package com.log4jstdouterr;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * Created by siva-2356 on 22/9/16.
 */
public class TracePrint {

    private String previouseline = null;
    private Logger log;
    private Level level;

    public TracePrint(final Logger log, final Level level) {
        this.log = log;
        this.level = level;
    }

    public void print(String line) {
        if (previouseline == null) {
            previouseline = line + "\n";
        }
        if(Util.match(line)) {
            previouseline += line;
        }
        else {
            log.log(level, previouseline);
            previouseline = line;
        }
    }
}

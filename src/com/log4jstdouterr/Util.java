package com.log4jstdouterr;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by siva-2356 on 22/9/16.
 */
public class Util {

    private static final String trace = "^\\t.*$";

    public static boolean match(String str) {
        Pattern p = Pattern.compile(trace);
        Matcher m = p.matcher(str);
        return m.matches();
    }
}

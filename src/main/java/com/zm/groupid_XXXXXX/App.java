package com.zm.groupid_XXXXXX;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        BasicConfigurator.configure ();
        Logger log = Logger.getLogger(App.class);
        log.debug("Hello World from log4j!");
    }
}

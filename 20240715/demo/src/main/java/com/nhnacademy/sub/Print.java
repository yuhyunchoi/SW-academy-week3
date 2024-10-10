package com.nhnacademy.sub;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Print{
    static Logger log = LogManager.getLogger(Print.class);
    public static void printMessage(){
        log.info("Print.printMessage(Hello World!)");
        System.out.println("Hello world!");
    }
}
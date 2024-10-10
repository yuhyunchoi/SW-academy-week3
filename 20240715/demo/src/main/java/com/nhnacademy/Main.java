package com.nhnacademy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.nhnacademy.sub.Print;

public class Main {
    public static void main(String[] args) {
        Logger log = LogManager.getLogger("demo");

        log.info("System.out.pirntln(\"Hello world!\")");
        Print.printMessage();
    }
}
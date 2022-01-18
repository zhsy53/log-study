package com.cat;

import org.apache.log4j.Logger;

public class LogTest {
    private static final Logger log = Logger.getLogger(LogTest.class);

    public static void main(String[] args) {
        log.info("hello log4j");
        log.info("goodbye");
    }
}

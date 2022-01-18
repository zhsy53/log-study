package com.cat;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogTest {
    private static final Logger log = LogManager.getLogger(LogTest.class);

    public static void main(String[] args) {
        log.info("hello {}", "log4j2");
        log.info("goodbye");
    }
}

package com.loki.slf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Loki on 2016/11/1.
 */
public class Demo {
    private static  final Logger logger = LoggerFactory.getLogger(Demo.class);

    public static void main(String[] args) {

logger.debug("test slf logging -debug mode");
logger.info("test slf logging -info mode");
logger.warn("test slf logging -warn mode");
logger.error("test slf logging -error mode");
    }
}

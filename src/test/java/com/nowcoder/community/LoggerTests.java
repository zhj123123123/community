package com.nowcoder.community;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.slf4j.Logger;


/**
 * @author zhj
 * @create 2022-06-09 21:58:22
 */
@SpringBootTest
public class LoggerTests {

    private static final Logger logger = LoggerFactory.getLogger(LoggerTests.class);


    @Test
    public void testLogger(){
        System.out.println(logger.getName());
            logger.debug("debug log");
        logger.info("info log");
        logger.warn("warn log");
        logger.error("error log");




    }


}

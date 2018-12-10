package com.example.logging.b;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class TestLogger1 {

    // 获取日志对象
    private Logger logger = LoggerFactory.getLogger(TestLogger1.class);

    public void testLog() {
        logger.warn("警告日志-b");
        logger.info("信息日志-b");
        logger.debug("调试日志-b");
        logger.error("错误日志-b");
    }
}

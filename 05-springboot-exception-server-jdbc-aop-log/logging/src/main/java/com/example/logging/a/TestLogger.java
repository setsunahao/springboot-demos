package com.example.logging.a;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class TestLogger {

    // 获取日志对象
    private Logger logger = LoggerFactory.getLogger(TestLogger.class);

    public void testLog() {
        logger.warn("警告日志");
        logger.info("信息日志");
        logger.debug("调试日志");
        logger.error("错误日志");
    }
}

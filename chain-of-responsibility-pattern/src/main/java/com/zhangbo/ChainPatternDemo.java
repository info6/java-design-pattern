package com.zhangbo;

import com.zhangbo.chain.AbstractLogger;
import com.zhangbo.chain.DebugLogger;
import com.zhangbo.chain.FileLogger;
import com.zhangbo.chain.InfoLogger;
import com.zhangbo.entity.LogInfo;

/**
 * 设计模式-责任链模式
 */
public class ChainPatternDemo {

	public static void main(String[] args) {

		//1、创建一个DEBUG级别的日志记录器
		AbstractLogger debugLogger = new DebugLogger();

		//2、创建一个INFO级别的日志记录器
		AbstractLogger infoLogger = new InfoLogger();

		//3、创建一个FILE级别的日志记录器
		AbstractLogger fileLogger = new FileLogger();

		//4、设置责任链
		debugLogger.setLogger(infoLogger);

		infoLogger.setLogger(fileLogger);

		//5、创建日志
		LogInfo logInfo = new LogInfo(2, "我是一条请求日志");

		//6、记录日志
		debugLogger.process(logInfo);

	}

}

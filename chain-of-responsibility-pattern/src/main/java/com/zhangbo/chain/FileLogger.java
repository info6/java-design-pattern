package com.zhangbo.chain;

/**
 * 文件日志记录器
 */
public class FileLogger extends AbstractLogger {

	public FileLogger() {
		super(AbstractLogger.FILE);
	}

	@Override
	public void log(String msg) {
		System.out.println("[FILE] msg: " + msg);
	}
}

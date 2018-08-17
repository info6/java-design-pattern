package com.zhangbo.chain;

/**
 * INFO日志记录器
 */
public class InfoLogger extends AbstractLogger {

	public InfoLogger() {
		super(AbstractLogger.INFO);
	}

	@Override
	public void log(String msg) {
		System.out.println("[INFO] msg: " + msg);
	}
}

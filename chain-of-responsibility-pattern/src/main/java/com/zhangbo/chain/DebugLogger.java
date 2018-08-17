package com.zhangbo.chain;

/**
 * DEBUG日志记录器
 */
public class DebugLogger extends AbstractLogger {

	public DebugLogger() {
		super(AbstractLogger.DEBUG);
	}

	@Override
	public void log(String msg) {
		System.out.println("[DEBUG] msg: " + msg);
	}
}

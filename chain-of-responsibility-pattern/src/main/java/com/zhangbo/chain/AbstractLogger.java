package com.zhangbo.chain;

import com.zhangbo.entity.LogInfo;

/**
 * 抽象的日志记录器
 */
public abstract class AbstractLogger {

	public static final int DEBUG = 0;

	public static final int INFO = 1;

	public static final int FILE = 2;

	protected int level;

	protected AbstractLogger logger;

	public AbstractLogger(int level) {
		this.level = level;
	}

	public void setLogger(AbstractLogger logger) {
		this.logger = logger;
	}

	public void process(LogInfo logInfo) {
		if (this.level == logInfo.getLevel()) {
			log(logInfo.getMsg());
		} else {
			System.out.println("无法处理，请求转出！");
			if (logger != null) {
				this.logger.process(logInfo);
			} else {
				System.out.println("不支持当前日志类型！");
			}
		}
	}

	public abstract void log(String msg);
}

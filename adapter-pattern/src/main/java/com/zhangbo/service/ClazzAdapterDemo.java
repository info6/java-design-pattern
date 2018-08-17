package com.zhangbo.service;

import com.zhangbo.service.clazzadapter.Adapter;
import com.zhangbo.service.clazzadapter.Hdmi;
import com.zhangbo.service.clazzadapter.Typec;

/**
 * 对象适配器模式
 */
public class ClazzAdapterDemo {

	/**
	 * 将mac下typec接口转换为hdmi接口连接显示器
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		//1、创建一个typec接口对象
		Typec typec = new Typec();

		//2、创建一个typec转hdmi适配器
		Hdmi hdmi = new Adapter(typec);

		//3、通过转换后的hdmi连接显示器
		hdmi.connection();

	}

}

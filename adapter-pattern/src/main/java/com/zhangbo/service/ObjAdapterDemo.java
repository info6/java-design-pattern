package com.zhangbo.service;

import com.zhangbo.service.objadapter.Adapter;
import com.zhangbo.service.objadapter.Hdmi;

/**
 * 类适配器模式
 */
public class ObjAdapterDemo {

	public static void main(String[] args) {

		//1、创建一个typec转换为hdmi的适配器
		Hdmi hdmi = new Adapter();

		//2、通过hdmi连接
		hdmi.connection();

	}

}

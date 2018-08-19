package com.zhangbo;

import com.zhangbo.template.QingCai;
import com.zhangbo.template.GaLiJi;
import com.zhangbo.template.CookTemplate;

/**
 * 设计模式--模板模式
 */
public class TemplatePatternDemo {

	public static void main(String[] args) {
		//1、炒一盘油菜
		CookTemplate qingcai = new QingCai("油菜");

		qingcai.process();

		System.out.println("************************");

		//2、做咖喱鸡
		CookTemplate galiji = new GaLiJi("鸡肉");

		galiji.process();

	}

}

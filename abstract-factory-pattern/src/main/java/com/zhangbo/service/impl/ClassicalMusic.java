package com.zhangbo.service.impl;

import com.zhangbo.service.Music;

/**
 * 古典乐
 */
public class ClassicalMusic implements Music {

	@Override
	public String getMusic() {
		return "古典乐";
	}
}

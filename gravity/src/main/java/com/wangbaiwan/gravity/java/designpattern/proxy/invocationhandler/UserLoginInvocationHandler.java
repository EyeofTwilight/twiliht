package com.wangbaiwan.gravity.java.designpattern.proxy.invocationhandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class UserLoginInvocationHandler implements InvocationHandler
{
	private UserLogin userLogin;

	public UserLoginInvocationHandler(UserLogin userLogin)
	{
		this.userLogin = userLogin;
	}

	/**
	 * @param proxy  为动态生成的代理对象, 一般无用
	 * @param method
	 * @param args
	 * @return
	 * @throws Throwable
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
	{
		// 调用userLogin的所有方法, 都会进入这个invoke方法, 包括toString equals等
		// 所以, 实际使用时若是只对一个方法拦截, 则需要对method进行名称、参数类型的判断等
		System.out.println("开始");
		Object o = method.invoke(userLogin, args);
		System.out.println("结束");
		return o;
	}
}


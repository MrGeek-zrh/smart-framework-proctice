package com.smartframework.practice.aspect;

import java.lang.reflect.Method;

import com.smartframework.annotation.Aspect;
import com.smartframework.annotation.Controller;
import com.smartframework.proxy.AspectProxy;

/**
 * 切面代理类
* <p>Title: StudentAspect.java<／p>
* <p>Description: <／p>
* <p>Copyright: Copyright (c) 2020<／p>
* <p>Company: CUIT<／p>
* @author MrGeek
* @date 2020-10-08_20:29:40
* @version 1.0
 */
@Aspect(Controller.class)
public class StudentAspect extends AspectProxy{
	
	@Override
	public void before(Class<?> cls, Method method, Object[] params) throws Throwable {
		System.out.println(cls.getName());
		System.out.println(method.getName());
		System.out.println(params);
		System.out.println("==========================");
		System.out.println("切点前");
		System.out.println(System.currentTimeMillis());
	}
	
	@Override
	public void after(Class<?> cls, Method method, Object[] params) throws Throwable {
		System.out.println("==========================");
		System.out.println("切点后");
		System.out.println(System.currentTimeMillis());
	}
}

package com.smartframework.practice.controller;

import com.smartframework.annotation.Action;
import com.smartframework.annotation.Controller;
import com.smartframework.annotation.Inject;
import com.smartframework.constant.Param;
import com.smartframework.constant.View;
import com.smartframework.practice.dao.StudentDao;
import com.smartframework.practice.dao.StudentDaoImpl;

/**
 * 页面跳转控制器：
 * 		主要用于页面跳转
* <p>Title: JumpPageCnotroller.java<／p>
* <p>Description: <／p>
* <p>Copyright: Copyright (c) 2020<／p>
* <p>Company: CUIT<／p>
* @author MrGeek
* @date 2020-09-30_21:06:14
* @version 1.0
 */
@Controller
public class JumpPageCnotroller {

	//暂时只能用实现类创建引用，不能将子类实例赋值给父类引用
	@Inject
	private StudentDaoImpl studentDaoImpl ;
	
	@Action("get:/JumpToIndexPage")
	public View JumpToIndexPage(Param param) {
		View view = new View("index.jsp");
		view.addModel("students", studentDaoImpl.findAllStudent());
		return view;
	}
}

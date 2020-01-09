package com.vegedog.atcrowdfunding.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class StartSystemListener implements ServletContextListener {

	//在服务器启动时，创建application对象时需执行的方法
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		//1.将项目上下文路径(request.getContextPath())放置到application域中
		ServletContext application =  sce.getServletContext();
		String contextPath = application.getContextPath();
		application.setAttribute("APP_PATH", contextPath);
		System.out.println("APP_PATH...");
		System.out.println(application.getContextPath());
		System.out.println(application.getAttribute(contextPath));
		//2.
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub

	}

}

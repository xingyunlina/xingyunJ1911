package com.xingyun;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name="ds01",urlPatterns = "/ds01",loadOnStartup = 1,initParams = {
		@WebInitParam(name="name",value="zs")} )

	public class ServletDemo extends HttpServlet {
		public ServletDemo() {
			System.out.println("我是ServletDemo的构造方法！");
		}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("我是doGet");
		String name = getInitParameter("name");
		System.out.println(name);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("我是doPost");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("我是init");
	}

}

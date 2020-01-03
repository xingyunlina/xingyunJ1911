package com.xingyun;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo01 extends HttpServlet {
	
    public ServletDemo01() {
       System.out.println("我是ServletDemo01的构造方法");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("我是01的doget方法");
		String name = getServletContext().getInitParameter("name");
	    System.out.println(name);
	    String age = getInitParameter("age");
	    System.out.println(age);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("我是01的dopost方法");
	}

}

package com.xingyun;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo01 extends HttpServlet {
	
    public ServletDemo01() {
       System.out.println("����ServletDemo01�Ĺ��췽��");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("����01��doget����");
		String name = getServletContext().getInitParameter("name");
	    System.out.println(name);
	    String age = getInitParameter("age");
	    System.out.println(age);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("����01��dopost����");
	}

}

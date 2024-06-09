package com.org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GetStudentData extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int sid = Integer.parseInt(req.getParameter("id"));
		String sname = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		String sgender = req.getParameter("gender");
//		System.out.println(sid);
//		System.out.println(sname);
//		System.out.println(age);
//		System.out.println(sgender);
		String html = "<html><body><h1> Good Evening " +sname+ "</h1></body></html>";
		PrintWriter pw = res.getWriter();
		pw.write(html);
	}

}

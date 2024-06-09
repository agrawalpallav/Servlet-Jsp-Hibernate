package com.org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/login")
public class ValidateLoginForm extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("pwd");
		
		if(email.equals("abc@gmail.com") && password.equals("1234")) {
			RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
			rd.forward(req, res);
		}
		else {
			PrintWriter pw = res.getWriter();
			String msg = "<html><body><h1>LOG IN FAILED</h1></body></html>";
			pw.write(msg);
			RequestDispatcher rd = req.getRequestDispatcher("loginForm.jsp");
			rd.include(req, res);
		}
		
	}

}

//create project servlet-004
//create database servlet_004
//declare dependencies - servlet, jsp, MySQL connector
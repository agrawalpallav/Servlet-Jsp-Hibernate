package log;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/val")
public class ValidateLogin extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("pwd");
		

		if(email.equals("abc@gmail.com") && password.equals("4321")) {
			HttpSession hs = req.getSession();
			hs.setAttribute("email", email);
			RequestDispatcher rd = req.getRequestDispatcher("home");
			rd.forward(req, resp);
		}
		else {
			PrintWriter pw = resp.getWriter();
			pw.write("<h1>LOG IN FAILED</h1>");
			RequestDispatcher rd = req.getRequestDispatcher("login2.jsp");
			rd.forward(req, resp);
		}
	}

}

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

@WebServlet("/home")
public class Home extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession hs = req.getSession();
		String email = (String) hs.getAttribute("email");
		if(email!=null) {
			PrintWriter pw = resp.getWriter();
			pw.write("<a href=msg>VIEW MESSAGE</a>");
			pw.write("<a href=lout>LOGOUT</a>");
		}
		else {
			RequestDispatcher rd = req.getRequestDispatcher("login2.jsp");
			rd.forward(req, resp);
		}
	}
}

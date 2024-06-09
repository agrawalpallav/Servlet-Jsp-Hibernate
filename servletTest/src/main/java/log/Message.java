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

@WebServlet("/msg")
public class Message extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession hs = req.getSession();
		String email = (String) hs.getAttribute("email");
		if(email!=null) {
			PrintWriter pw = resp.getWriter();
			pw.write("<h1>HELLO EVERYONE</h1>");
		}
		else {
			RequestDispatcher rd = req.getRequestDispatcher("login2.jsp");
			rd.forward(req, resp);
		}
	}

}

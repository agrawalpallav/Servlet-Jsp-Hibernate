 package httsession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/servlet2")
public class ServletTwo extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession hs2 = req.getSession();
		String email =(String) hs2.getAttribute("email");
		String password =(String) hs2.getAttribute("pwd");
		System.out.println(email);
		System.out.println(password);
		
		PrintWriter pw = resp.getWriter();
		pw.write("<a href = servlet3 >ServletThree</a>");
		
	}

}

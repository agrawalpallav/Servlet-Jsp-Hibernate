import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class ReadForm extends GenericServlet{
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String name = req.getParameter("n");
		String age = req.getParameter("a");
		
		PrintWriter out = res.getWriter();
		out.println(name + age);
		//System.out.println(age);
	}
	
	
	
}

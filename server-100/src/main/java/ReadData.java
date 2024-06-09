import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class ReadData extends GenericServlet{
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String ename = req.getParameter("n");
		String esal = req.getParameter("a");
		String deptno = req.getParameter("b");
		
		System.out.println(ename);
		System.out.println(esal);
		System.out.println(deptno);
	}
	
	
	
}
//study about deployment descriptor
//create maven project servlet-003 add dependencies(servlet and jsp dependencies)
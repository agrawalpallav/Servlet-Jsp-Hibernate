package com.org;

import java.sql.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/view")
public class ViewDoctors extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_004", "root", "root");
			String sql = "SELECT * FROM doctor";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			PrintWriter pw = resp.getWriter();
			pw.write("<html><body>");
			pw.write("<table border=2px><tr>");
			pw.write("<th>ID</th>");
			pw.write("<th>NAME</th>");
			pw.write("<th>AGE</th>");
			pw.write("<th>PHONE</th>");
			pw.write("<th>SPEC</th>");
			pw.write("</tr>");
			
			while(rs.next()) {
				pw.write("<tr>");
				pw.write("<td>"+rs.getInt(1)+"</td>");
				pw.write("<td>"+rs.getString(2)+"</td>");
				pw.write("<td>"+rs.getInt(3)+"</td>");
				pw.write("<td>"+rs.getLong(4)+"</td>");
				pw.write("<td>"+rs.getString(5)+"</td>");
				pw.write("</tr>");
			}
			
			pw.write("</table></body></html>");
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}

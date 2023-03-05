package com.wu.crmdemo.testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class testDB
 */
@WebServlet("/testDB")
public class testDB extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String databaseDriver = "oracle.jdbc.driver.OracleDriver";
		String connectionURL = "jdbc:oracle:thin:@localhost:1521:XE"; 
		String userName = "eeshan2001"; String passWord = "ee1108";
		String sqlQuery = "SELECT * FROM Emp";
		
		try {
				PrintWriter out = response.getWriter();
				out.println("Connecting with the Database by .... " +connectionURL);
				Class.forName(databaseDriver);
				Connection con = DriverManager.getConnection(connectionURL, userName, passWord);
				out.println("Successfully Connected !!!");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

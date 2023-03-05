package com.wu.crmdemo.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wu.crmdemo.dao.CustomerDAO;
import com.wu.crmdemo.entity.Customer;

/**
 * Servlet implementation class DisplayCustomerServlet
 */
@WebServlet("/DisplayCustomerServlet")
public class DisplayCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public DisplayCustomerServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		CustomerDAO customerDAO = new CustomerDAO();
		ArrayList<Customer> customer = customerDAO.getCustomers();
		//System.out.println(customers);
		// Populating the request object with customers ArrayList object
		// And then we redirect to some view page --- list-customers.jsp along with request object
		request.setAttribute("custdata", customer);
		RequestDispatcher rd = request.getRequestDispatcher("list-customer.jsp");
		rd.forward(request, response);
		
	}

}

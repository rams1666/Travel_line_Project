/*package com.vir.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vir.model.Booking;
import com.vir.service.AdminServiceImpl;

*//**
 * Servlet implementation class ViewFeedbackServlet
 *//*
@WebServlet({ "/ViewFeedbackServlet", "/viewfeedback" })
public class ViewFeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    *//**
     * @see HttpServlet#HttpServlet()
     *//*
    public ViewFeedbackServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	*//**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 *//*
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		AdminServiceImpl asf = new AdminServiceImpl();
		List<Booking> viewFeedback = asf.viewFeedback();
		request.setAttribute("view", viewFeedback);
		RequestDispatcher view = request.getRequestDispatcher("ViewFeedback.jsp");
        view.forward(request, response);
	}

	*//**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 *//*
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
*/
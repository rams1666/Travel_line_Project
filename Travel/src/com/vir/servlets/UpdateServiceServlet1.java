package com.vir.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vir.model.BusService;
import com.vir.service.AdminService;
import com.vir.service.AdminServiceImpl;
import com.vir.service.BusServiceServiceImpl;

/**
 * Servlet implementation class UpdateService1
 */
@WebServlet({ "/UpdateService1", "/updated" })
public class UpdateServiceServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServiceServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
       // int sid = Integer.parseInt(request.getParameter("service_no"));  
        String source=request.getParameter("from");
		String destination= request.getParameter("to");
		int capacity=Integer.parseInt(request.getParameter("capacity"));
		float fare=Float.parseFloat(request.getParameter("fare"));
		float distance=Float.parseFloat(request.getParameter("distance"));
		String departure= request.getParameter("deaparture");
		String journey= request.getParameter("journey");  
          
        BusService e=new BusService();  
        //e.setServiceId(sid);  
        e.setServiceFrom(source);  
        e.setServiceTo(destination);  
        e.setBusCapacity(capacity);
        e.setFare(fare);
        e.setDistance(distance);
        e.setDepartureTime(departure);
        e.setJourneyTime(journey);
        AdminServiceImpl asi = new AdminServiceImpl();
        int status = asi.updateDetails(e);
        //int status=E.update(e);
        
        if(status>0){  
            response.sendRedirect("ModifyService_2"); 
            out.println("successfully modified ");
        }else{  
            out.println("Sorry! unable to update record");  
        }  
          
        out.close();  
    }  
	}



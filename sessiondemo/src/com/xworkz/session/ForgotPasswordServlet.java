package com.xworkz.session;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ForgotPasswordServlet
 */
@WebServlet("/fps")
public class ForgotPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    		System.out.println("doPost() is started from fps Servlet..");
    		
    		HttpSession session=request.getSession();
    		System.out.println(session);
    		
    		String emailId=(String) session.getAttribute("em");
    		System.out.println("email=="+emailId);
    		
    		session.invalidate();
    		
    		request.setAttribute("eml", emailId);
    		RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
    		rd.forward(request, response);
    		
    		System.out.println("doPost() is ended ...");

	}

}

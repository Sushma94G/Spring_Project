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
 * Servlet implementation class LogInServlet
 */
@WebServlet("/ls")
public class LogInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost() is started...");
		RequestDispatcher rd=null;
		HttpSession session=null;
		
		String email=request.getParameter("email");
		String password=request.getParameter("pass");

		if(email.equals("test@test.com")&& password.equals("test") ) {
			System.out.println("LogIn success....");
			
			session=request.getSession();
			System.out.println(session);
			
			session.getId();
			
			session.setMaxInactiveInterval(3*60);
			
			session.setAttribute("em",email);
			
			
			rd=request.getRequestDispatcher("/fps");
			
		}
		else {
			rd=request.getRequestDispatcher("login.jsp");

		}
		
		rd.forward(request, response);
		
		System.out.println("doPost() is ended...");

	}

}

package com.xwrokz.cookies;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.CookieStore;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LogInServlet
 */
@WebServlet("/ls")
public class LogInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    		System.out.println("dopost() started...");
    		
    		String email=request.getParameter("email");
    		String password=request.getParameter("pass");
    		
    		Cookie[] ck=request.getCookies();
    		System.out.println(ck.length);
    		
    		for (Cookie cookie : ck) {
    			System.out.println(cookie.getName()+"\t"+cookie.getValue());
				
			}
    		
    		Cookie ck1=new Cookie("em",email);
    		Cookie ck2=new Cookie("pwd",password);
    		
    		ck1.setMaxAge(20);
    		ck2.setMaxAge(2*60);
    		
    		response.addCookie(ck1);
    		response.addCookie(ck2);
    		
    		response.setContentType("text/html");
    		PrintWriter out=response.getWriter();  
    		//out.println("<h1>welcome "+email+"</h1>");
    
    		System.out.println("dopost() ended...");

	}

}

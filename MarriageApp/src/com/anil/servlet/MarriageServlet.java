package com.anil.servlet;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;



public class MarriageServlet extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		
		PrintWriter pw=res.getWriter();
		
		String name=req.getParameter("pname");
		int age=Integer.parseInt( req.getParameter("age"));
		String gender=req.getParameter("gender");
		
		if(gender.equalsIgnoreCase("Male")) {
			if(age<21) {
				pw.println("<br> <h1 style='color: green;text-align:center'>Mr. "+name+" you are not eligible for marriage, enjoy life</h1>");
			}
			else {
				pw.println("<br> <h1 style='color: green;text-align:center'>Mr. "+name+" you are eligible for marriage, but think once</h1>");
			}
		}
		else {
			if(age<18) {
				pw.println("<br> <h1 style='color: green;text-align:center'>Miss. "+name+" you are not eligible for marriage, be happy</h1>");
			}
			else {
				pw.println("<br> <h1 style='color: green;text-align:center'>Miss. "+name+" you are eligible for marriage, but think twice</h1>");
			}
		}
		
		pw.println("<br> <h1 style='color:red;text-align:center'></h1>");

		
		
		pw.println("<h1 style='color:red;text-align:center'>Your Details</h1>");
		pw.println("<h2 style='color:green;text-align:center'>Name::"+name+"</h2>");
		pw.println("<h2 style='color:green;text-align:center'>Age::"+age+"</h2>");
		pw.println("<h2 style='color:green;text-align:center'>Gender::"+gender+"</h2>");
		
		pw.println("<br><br><br> <center><a href='input.html'><img src='images/e.JPG' style='width:300px; height:100px'></a></center>");
		
		pw.close();
	}
}

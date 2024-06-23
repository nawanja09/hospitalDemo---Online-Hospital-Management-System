package com.User;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UserInsert")
public class UserInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String Fname=request.getParameter("fname");
		String Lname=request.getParameter("lname");
		String Email=request.getParameter("email");
		String NIC=request.getParameter("nic");
		String Phone=request.getParameter("pn");
		String DOB=request.getParameter("dob");
		String Address=request.getParameter("address");
		String Username=request.getParameter("uid");
		String Password=request.getParameter("pwdre");
		
		
		
		
		
		
		boolean IsTrue;
		IsTrue = UserDButil.insertUser(Fname, Lname, NIC,Phone,DOB, Email,Address,Username,Password);
		if (IsTrue==true) {
			RequestDispatcher dis=request.getRequestDispatcher("success.jsp");
			dis.forward(request, response);
		}
		else{
			RequestDispatcher dis2=request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
		 
	}

}

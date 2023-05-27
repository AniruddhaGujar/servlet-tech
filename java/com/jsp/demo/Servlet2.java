package com.jsp.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String tname = null;

//		Cookie cookies[] =  req.getCookies();
//		 for (Cookie c : cookies) {
//			tname = c.getValue();
//		}

		HttpSession httpSession = req.getSession();
		tname = (String) httpSession.getAttribute("sname");

		PrintWriter printWriter = resp.getWriter();
		printWriter.print("<html><body><h1>" + "Welcome back " + tname + " to my website " + "</h1></body></html>");
		printWriter.print("<a href = 'servlet3'>log out</a>");

	}
}


//
//Spring is an open source framework which is use in building interprice java application (J2EE).
//
//Spring amis to simplify the complaxity of java application of development process by offering a framework 
//that includes technology such as asspect orianted programing , MBC based programing , Dependency injection , POJO (plain old java project)
//
//
//why spring??
//Adv of Spring 
//1. even with all this technology mention above spring is light weight framwork that can be use to create scalable , secure and robust interprise 
//web application.
//2. the spring framework is also the base that powers all other spring based projects such as springboot , spring mvc, spring cloud , etc.
//3. 
package com.sathya.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

        public CalculatorServlet() {
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int num1 = Integer.parseInt( request.getParameter("firstNum"));
		int num2 = Integer.parseInt( request.getParameter("secondNum"));
		String Operator = request.getParameter("Operation");
		
		int result = 0;
		
		switch (Operator) {
		case "+": result = num1 + num2;
			
			break;
			
		case "-" : result = num1 - num2;
			break;
			
		case "*": result = num1 * num2;
			break;
			
		case "/": result = num1 / num2;
			break;
		
		case "%": result = num1 % num2;
			break;

		
		}
		
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<body bgcolor = pink");
		writer.println("<h1> Calculated Data...</h1>");
		writer.println("Your First Number" +num1+"<br><br>");
		writer.println("Your Second Number" + num2+"<br><br>");
		writer.println("Your Operator" + Operator +"<br><br>");
		writer.println("Your Result.." + result+"<br><br>");
		writer.println("</body>");
		writer.println("</html>");
		
		
		
		
		
		
	}

}

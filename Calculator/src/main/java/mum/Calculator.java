package mum;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Servlet implementation class MyServletParm
 */
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculator() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
  		String add1 = request.getParameter("add1").trim() ;
  		System.out.println(add1);
		String add2 = request.getParameter("add2").trim();
		System.out.println(add2);

		String mult1 = request.getParameter("mult1").trim();
		System.out.println(mult1);
		String mult2 = request.getParameter("mult2").trim();
		System.out.println(mult2);

		String sum = "";
		String product = "";

		
		// Check for valid inputs....
		try {
			Integer a1 = Integer.parseInt(add1);
			Integer a2 = Integer.parseInt(add2);
			sum = "" + (a1+a2);
		} catch(NumberFormatException e) {
			if (add1.isEmpty()) add1 = "''";
			if (add2.isEmpty()) add2 = "''";
			sum = "''";
		}
		
		/*
		 * Integer.parseInt(str) throws NumberFormatException 
		 * if the string cannot be converted to an integer.
		 */
		
		try {
			Integer m1 = Integer.parseInt(mult1);
			Integer m2 = Integer.parseInt(mult2);
			product = "" + (m1 * m2);
		} catch(NumberFormatException e) {
			if (mult1.isEmpty()) mult1 = "''";
			if (mult2.isEmpty()) mult2 = "''";
			product = "''";
		}
		System.out.println("Sum: " + sum);
		System.out.println("Mult: " + product);
		request.setAttribute("addition", sum);
		request.setAttribute("product", product);
		request.getRequestDispatcher("result.jsp").forward(request,response);
		//response.sendRedirect("result.jsp");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

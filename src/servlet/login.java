package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.User;
import utitlies.Authentication;
import utitlies.AuthenticationIm;

/**
 * Servlet implementation class login
 */
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Set the output
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		// Get the input from the sign in
		int roll = Integer.parseInt(request.getParameter("roll"));
		String password = request.getParameter("password");
		
		//Setting the values in bean
		User ubean = new User();
		ubean.setRollno(roll);
		ubean.setPassword(password);
		
		//Calling the method
		AuthenticationIm auth = new AuthenticationIm();
		boolean result = auth.authenticate(ubean);
		
		if(result != true)
		{
			request.getRequestDispatcher("error.jsp").forward(request, response);;
		}
		else
		{
			String role = auth.authorize(""+roll);
			System.out.println(role);
			if(role.equalsIgnoreCase("h"))
			{
				request.setAttribute("roll", roll);
				request.setAttribute("result", result);
				request.getRequestDispatcher("hod.jsp").forward(request, response);
			}
			if(role.equalsIgnoreCase("t"))
			{	
				request.setAttribute("roll", roll);
				request.setAttribute("result", result);
				request.getRequestDispatcher("teacher.jsp").forward(request, response);
			}
			if(role.equalsIgnoreCase("s"))
			{
			request.setAttribute("roll", roll);
			request.setAttribute("result", result);
			request.getRequestDispatcher("students.jsp").forward(request, response);;
			}
			else {
				request.getRequestDispatcher("error.jsp").forward(request, response);
			}
		}
			
		
		
	}

}

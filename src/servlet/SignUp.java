package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.User;
import dao.UserIm;

/**
 * Servlet implementation class SignUp
 */
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUp() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//Get the input from Signup 
		String first_name = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		String email = request.getParameter("email");
		int roll = Integer.parseInt(request.getParameter("roll"));
		String password = request.getParameter("password");
		String branch = request.getParameter("branch");
		int contact = Integer.parseInt(request.getParameter("contact"));
		
		//Calling Bean
		User uBean = new User();
		
		//Setting the value
		uBean.setFirst_name(first_name);
		uBean.setLast_name(last_name);
		uBean.setEmail(email);
		uBean.setRollno(roll);
		uBean.setPassword(password);
		uBean.setBranch(branch);
		uBean.setContact(contact);
		
		//Get the result
		UserIm im = new UserIm();
		String id = im.createUser(uBean);
		
		//Output
		request.setAttribute("Result", id);
		request.getRequestDispatcher("home.jsp").forward(request, response);
		
	}

}

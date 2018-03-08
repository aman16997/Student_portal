package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.User;
import bean.credentials;
import bean.resume;
import dao.CredentialsIm;
import dao.ResumeIm;
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
		String role = request.getParameter("role");
		
		//Calling Bean
		User uBean = new User();
		resume rs = new resume();
		credentials cre = new credentials();
		
		//Setting the value on User Bean
		uBean.setFirst_name(first_name);
		uBean.setLast_name(last_name);
		uBean.setEmail(email);
		uBean.setRollno(roll);
		//uBean.setPassword(password);
		uBean.setBranch(branch);
		uBean.setContact(contact);
		
		//Setting the value on Resume Bean
		rs.setFirst_name(first_name);
		rs.setLast_name(last_name);
		rs.setEmail(email);
		rs.setBranch(branch);
		rs.setContact(contact);
		
		//Setting the values on Credentials Bean
		cre.setRoll(roll);
		cre.setPassword(password);
		cre.setRole(role);
		
		//Get the result from credentials
		CredentialsIm cred = new CredentialsIm();
		String id = cred.createCredentials(cre);
		System.out.println(id);
		
		//Get the result from user 
		UserIm im = new UserIm();
		String id1 = im.createUser(uBean);
		
		
		//Get the result from Resume 
		ResumeIm rsim = new ResumeIm();
		String id2 = rsim.createResume(rs); 
		System.out.println(id2);
		
		
		//Output
		request.setAttribute("Credentials", id);
		request.setAttribute("Result", id1);
		request.getRequestDispatcher("home.jsp").forward(request, response);
		
	}

}

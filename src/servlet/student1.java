package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.User;
import bean.resume;
import dao.ResumeIm;
import dao.UserIm;

/**
 * Servlet implementation class student1
 */
public class student1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public student1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
	
		//Get the input from Signup 
		String first_name = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		String email = request.getParameter("email");
		int contact = Integer.parseInt(request.getParameter("contact"));
		String branch = request.getParameter("branch");
		String education = request.getParameter("education");
		String achivement = request.getParameter("achivement");
		String git = request.getParameter("git");
		String intership = request.getParameter("intership");
		String hobbies = request.getParameter("hobbies");
		String skill = request.getParameter("skill");
		String other = request.getParameter("other");
		
		//Create an object of bean
		resume rs = new resume();
		User ubean = new User();
		
		//Setting the value of Bean Resume
		rs.setFirst_name(first_name);
		rs.setLast_name(last_name);
		rs.setEmail(email);
		rs.setContact(contact);
		rs.setBranch(branch);
		rs.setEducation(education);
		rs.setAchivement(achivement);
		rs.setGit(git);
		rs.setIntership(intership);
		rs.setHobbies(hobbies);
		rs.setSkill(skill);
		rs.setOther(other);
		
		
		//Create an object of Dao Class
		ResumeIm im = new ResumeIm();
		UserIm u = new UserIm();
		
		//Calling the function in Resume Dao
		im.createResume(rs);
		//Calling the function in User Dao
		u.updateUser(ubean);
		
		
		
	}

	

}

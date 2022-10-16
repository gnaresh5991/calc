package Calc;
import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet("/calc")
public class Servlet_1 extends GenericServlet {
	
	
	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		double a=Double.parseDouble(req.getParameter("v1"));
		double b=Double.parseDouble(req.getParameter("v2"));
		
		String s=req.getParameter("s1");
		
		if(s.equals("add"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("add");
					rd.forward(req, res);
		}
		else if(s.equals("sub"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("sub");
			rd.forward(req, res);
			
		}
		else if(s.equals("multiplay"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("multiplay");
			rd.forward(req, res);
		}
		else if(s.equals("divide"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("divide");
			rd.forward(req, res);
		}
		else {
			RequestDispatcher rd=req.getRequestDispatcher("remainder");
			rd.forward(req, res);
		}
		

	}
	

}

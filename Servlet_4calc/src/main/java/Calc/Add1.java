package Calc;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/add")
public class Add1  extends GenericServlet{

	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		try
		{	double result=0;
		double a=Double.parseDouble(req.getParameter("v1"));
		double b=Double.parseDouble(req.getParameter("v2"));

		result=a+b;

		pw.println("Addition value:"+result);

		}
		catch(Exception e)
		{
			pw.println("Enter Integer only..");
		}

		RequestDispatcher rd=req.getRequestDispatcher("input.html");
		rd.include(req, res);
	}

}

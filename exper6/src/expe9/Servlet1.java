package expe9;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				
				String value = request.getParameter("Link1");
				
				if(value.equals("Hotstar")) {
					//out.println("addition operation by servlet 1");
					response.sendRedirect("https://www.hotstar.com/in");
				}
				else if(value.equals("Netflix")) {
					//response.sendRedirect("Servlet2");
					response.sendRedirect("https://www.netflix.com/signup");
				}
				else if(value.equals("Aha")) {
					//response.sendRedirect("Servlet2");
					response.sendRedirect("https://www.aha.video/");
				}
				else if(value.equals("Prime")) {
					//response.sendRedirect("Servlet2");
					response.sendRedirect("https://www.primevideo.com/ref=atv_nb_logo");
				}
				else if(value.equals("Youtube")) {
					//response.sendRedirect("Servlet2");
					response.sendRedirect("https://www.youtube.com/");
				}
			}

		 /**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

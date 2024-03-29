package de.vogella.wtp.jsp.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	  private static String DELETE_JSP = "/Delete.jsp";
	  private static String EDIT_JSP = "/Edit.jsp";
	  private static String SHOWALL_JSP = "/ShowAll.jsp";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
   }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String forward="";
        // Get a map of the request parameters
        @SuppressWarnings("rawtypes")
		Map parameters = request.getParameterMap();
        if (parameters.containsKey("delete"))
        {
          forward = DELETE_JSP;
        } 
        else if (parameters.containsKey("edit"))
        {
          forward = EDIT_JSP;
        } 
        else 
        {
          forward = SHOWALL_JSP;
        }
        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }
    

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

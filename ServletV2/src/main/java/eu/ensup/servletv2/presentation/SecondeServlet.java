package eu.ensup.servletv2.presentation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SecondeServlet
 */
public class SecondeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<HTML>");
		out.println("<HEAD><TITLE>Bonjour</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<H1>Liste des 10 méthodes de l'HTTPREQUEST</H1>");
		out.println("<LI> Session : " + request.getSession());
		out.println("<LI> Contexte : " + request.getContextPath());
		out.println("<LI> Local Port : " + request.getLocalPort());
		out.println("<LI> Local addr. : " + request.getLocalAddr());
		out.println("<LI> Remote Port : " + request.getRemotePort());
		out.println("<LI> Cookies : " + request.getCookies());
		out.println("<LI> Protocol : " + request.getProtocol());
		out.println("<LI> Remote User : " + request.getRemoteHost());
		out.println("<LI> Server name : " + request.getServerName());
		out.println("<LI> Reader : " + request.getReader());
		out.println("</BODY>");
		out.println("</HTML>");
		
		HttpSession maSession = request.getSession();
		
		String contextPath = request.getContextPath();
		
		int localPort = request.getLocalPort();
		
		String localAddr = request.getLocalAddr();
		
		int remotePort = request.getRemotePort();
		
		Cookie[] cookies = request.getCookies();
		
		String protocole = request.getProtocol();
		
		String remoteUser = request.getRemoteHost();
		
		String serverName = request.getServerName();
		
		BufferedReader reader = request.getReader();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

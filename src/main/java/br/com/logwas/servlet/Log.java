package br.com.logwas.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Jorge Luis de Souza
 * <p>@Servlet implementation class Log
 * <p>Servlet simples para testar a geracao de logs no ambiente
 * 
 */
public class Log extends HttpServlet {
	private static final long serialVersionUID = 1L;
	final Logger logger = LogManager.getLogger(Log.class);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Log() {
		super();

	}

	/***
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		logger.debug("Teste de geracao de LOG no ambiente");
		response.getWriter().append("br.com.logwas: geracao de LOG ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

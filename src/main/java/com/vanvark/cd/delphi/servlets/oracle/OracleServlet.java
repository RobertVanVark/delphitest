package com.vanvark.cd.delphi.servlets.oracle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class OracleServlet extends HttpServlet {

	protected void doGet (HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String query = request.getParameter("query");
		if (query == null) {
			new IndexPage().writeOn(response);
		} else {
			new ResultPage(query).writeOn(response);
		}
	}

}

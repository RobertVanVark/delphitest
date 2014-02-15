package com.vanvark.cd.delphi.servlets;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

public abstract class AbstractPage {
	protected String contentType;

	public AbstractPage() {

		contentType = "text/plain";
	}

	public void writeOn (HttpServletResponse response) throws IOException {

		setContentTypeAndStatus(response);
		response.getWriter().print(createBody());
	}

	protected void setContentTypeAndStatus (HttpServletResponse response) {

		response.setContentType(contentType);
		response.setStatus(HttpServletResponse.SC_OK);
	}

	protected abstract String createBody ();

}

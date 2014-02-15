package com.vanvark.cd.delphi.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

public abstract class AbstractHtmlPage extends AbstractPage {

	public AbstractHtmlPage() {

		contentType = "text/html";
	}

	public void writeOn (HttpServletResponse response) throws IOException {

		writeOn(createBody(), response);
	}

	private void writeOn (String bodyHtml, HttpServletResponse response) throws IOException {

		setContentTypeAndStatus(response);
		PrintWriter writer = response.getWriter();
		writeHeaderTo(writer);
		writer.println(bodyHtml);
		writeFooterTo(writer);
	}

	private void writeHeaderTo (PrintWriter writer) {

		writer.println("<html>");
		writer.println("<header></header>");
		writer.println("<body>");
	}

	private void writeFooterTo (PrintWriter writer) {

		writer.println("</body>");
		writer.println("</html>");
	}

}

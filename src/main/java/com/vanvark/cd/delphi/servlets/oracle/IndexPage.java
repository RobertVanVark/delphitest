package com.vanvark.cd.delphi.servlets.oracle;

import com.vanvark.cd.delphi.servlets.AbstractHtmlPage;

public class IndexPage extends AbstractHtmlPage {

	@Override
	protected String createBody () {

		return "<h1>Enter a query to the Oracle:</h1>" //
				+ "<form>" //
				+ "  <input type=\"text\" name=\"query\"/>" //
				+ "  <input type=\"submit\">" //
				+ "</form>";
	}

}

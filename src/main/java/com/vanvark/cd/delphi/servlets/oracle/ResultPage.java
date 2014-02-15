package com.vanvark.cd.delphi.servlets.oracle;

import com.vanvark.cd.delphi.oracle.OracleGenerator;
import com.vanvark.cd.delphi.servlets.AbstractHtmlPage;

public class ResultPage extends AbstractHtmlPage {

	private String query;

	public ResultPage(String query) {

		this.query = query;
	}

	@Override
	public String createBody () {

		return "<h1>The Oracle answers:</h1>" //
				+ OracleGenerator.generate(query) //
				+ "<h1>Enter a query to the Oracle:</h1>" //
				+ "<form>" //
				+ "  <input type=\"text\" name=\"query\"/>" //
				+ "  <input type=\"submit\">" //
				+ "</form>";
	}
}

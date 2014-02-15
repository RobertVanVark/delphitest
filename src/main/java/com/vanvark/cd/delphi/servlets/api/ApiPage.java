package com.vanvark.cd.delphi.servlets.api;

import com.vanvark.cd.delphi.oracle.OracleGenerator;
import com.vanvark.cd.delphi.servlets.AbstractPage;

public class ApiPage extends AbstractPage {

	private String query;

	public ApiPage(String query) {

		super();
		this.query = query;
	}

	@Override
	protected String createBody () {

		return OracleGenerator.generate(query);
	}

}

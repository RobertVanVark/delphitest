package com.vanvark.cd.delphi.oracle;

public class OracleGenerator {

	public static String generate (String query) {

		if (query == null) {
			return "";
		}
		if (query.contains("CD")) {
			return "Continuous Delivery";
		}
		if (query.contains("stack")) {
			throw new RuntimeException("testing purpose");
		}
		if (query.contains("CI")) {
			return "Continuous Delivery (testing purpose)";
		}
		return "";
	}
}

package org.testing.utilities;

import java.util.regex.Pattern;

public class VariableReplacement {

	public static String assignValue(String data, String VariableName, String VariableValue)
	{
		data=data.replaceAll(Pattern.quote("{{"+VariableName+"}}"), VariableValue);
		return data;
	}
}

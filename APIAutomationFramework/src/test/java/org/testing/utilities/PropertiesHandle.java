package org.testing.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
//purpose of this method is to laod the property file
//input to this method is the location path of the property file
//output of this method is the Properties class object
public class PropertiesHandle {
	
	public static Properties readPropertyFile(String Filepath) throws IOException
	{
		File f=new File(Filepath);
		FileReader reader=new FileReader(f);
		Properties pr=new Properties();
		pr.load(reader);
		return pr;
	}

}

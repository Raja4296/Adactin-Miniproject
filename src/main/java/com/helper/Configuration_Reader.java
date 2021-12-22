package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;
	
	public Configuration_Reader() throws Throwable {
		File f = new File("C:\\Users\\Rajapandi\\eclipse-workspace\\Dec_Project\\src\\main\\java\\com\\properties\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);	
	}
	
	public String getURL() {
		String URL = p.getProperty("url");
		return URL;
	}
	
	public String getUsername() {
		String username = p.getProperty("username");
		return username;
	}
	
	public String getPassword() {
		String password = p.getProperty("password");
		return password;
	}
}
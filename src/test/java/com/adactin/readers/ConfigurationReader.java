package com.adactin.readers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

@SuppressWarnings("unused")
public class ConfigurationReader {

	public static Properties p;

	public ConfigurationReader() throws IOException {
		File d = new File(
				"C:\\Users\\DELL\\eclipse-workspace\\cucumberProject\\src\\test\\java\\com\\adactin\\properties\\Configuration.Properties");
		FileInputStream fis = new FileInputStream(d);
		p = new Properties();
		p.load(fis);

	}

	public String gerBrowserName() {
		String browser = p.getProperty("browserName");
		return browser;
	}

	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}

}

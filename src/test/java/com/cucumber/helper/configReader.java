package com.cucumber.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class configReader {
	public static Properties properties;
	public static String propertyFilepath = System.getProperty("user.dir")
			+ "src\\test\\java\\com\\cucumber\\helper\\configuration.properties";

	public configReader() {
		File file = new File(propertyFilepath);
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public String getBrowserName() {
		String browserName = properties.getProperty("browserName");
		if (browserName != null) {
			return browserName;
		} else {
			throw new RuntimeException("browser name not found in properties file");
		}
	}

	public long getImplicitlywait() {
		String implicitlywait = properties.getProperty("implicitywait");
		if (implicitlywait != null) {
			return Long.parseLong(implicitlywait);
		} else

		{
			throw new RuntimeException("implicitywait not specified properties file.");

		}
	}

	private String geturl() {
		String url = properties.getProperty("url");
		if (url != null) {
			return url;
		} else {
			throw new RuntimeException("url not specified is the configuration.properties file.");

		}
	}
}
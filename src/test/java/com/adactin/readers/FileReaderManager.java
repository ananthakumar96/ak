package com.adactin.readers;

import java.io.IOException;

public class FileReaderManager {

	private FileReaderManager() {
	}

	public static FileReaderManager getObject() {
		FileReaderManager fr = new FileReaderManager();
		return fr;

	}

	public ConfigurationReader ObjectCR() throws IOException {
		ConfigurationReader cr = new ConfigurationReader();
		return cr;
	}

}

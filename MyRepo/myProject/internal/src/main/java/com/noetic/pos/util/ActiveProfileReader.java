package com.noetic.pos.util;

import java.io.File;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ActiveProfileReader {
	private static Logger log = LoggerFactory.getLogger(ActiveProfileReader.class);

	public static boolean isFileExist(String fileNameAndLocation) {
		boolean isFileExist = false;
		try {
			File file = new File(fileNameAndLocation);
			if (file.exists()) {
				isFileExist = true;
			}
		} catch (Exception e) {
			log.warn("File does not exist {}", e.getMessage());
			isFileExist = false;
		}

		return isFileExist;
	}

}

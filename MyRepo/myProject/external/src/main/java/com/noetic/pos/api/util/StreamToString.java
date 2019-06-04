package com.noetic.pos.api.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.noetic.pos.exception.InvalidInputExceptionJson;

public class StreamToString {
	
	 public static String convertStreamToString(InputStream is) throws InvalidInputExceptionJson {

	        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
	        StringBuilder sb = new StringBuilder();

	        String line = null;
	        try {
	            while ((line = reader.readLine()) != null) {
	                sb.append(line + "\n");
	            }
	        } catch (IOException e) {
	            throw (new InvalidInputExceptionJson(e.getMessage()));
	        } finally {
	            try {
	                is.close();
	            } catch (IOException e) {
	                throw (new InvalidInputExceptionJson(e.getMessage()));
	            }
	        }
	        return sb.toString();
	    }

}

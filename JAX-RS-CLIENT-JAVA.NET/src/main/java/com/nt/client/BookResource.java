package com.nt.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class BookResource {

	public static void main(String[] args)throws Exception {
		
		String bookUrl="http://localhost:4040/JAX-RS-GERSEY-IMPLEMENTATION/rest/book/get";
		//create the url object
		URL url=new URL(bookUrl);
		//create and estabilsh the connection
		HttpURLConnection httpcon=(HttpURLConnection) url.openConnection();
		//get the request type to resource
		httpcon.setRequestMethod("GET");
		//get the status code
		int statusCode=httpcon.getResponseCode();
		System.out.println(statusCode);
		
		if(statusCode==200) {
			BufferedReader reader=new BufferedReader(new InputStreamReader(url.openStream()));
			System.out.println(reader.readLine());
			httpcon.disconnect();
			
		}
		else {
			System.out.println("connection failed");
		}
		

	}

	
}

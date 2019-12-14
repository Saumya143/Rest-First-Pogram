package com.nt.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.model.Book;

public class BookResourcePost {

	public static void main(String[] args)throws Exception {
		
		String bookUrl="http://localhost:4040/JAX-RS-GERSEY-IMPLEMENTATION/rest/book/addBook";
		//create the url object
		URL url=new URL(bookUrl);
		//create and estabilsh the connection
		HttpURLConnection httpcon=(HttpURLConnection) url.openConnection();
		//get the request type to resource
		httpcon.setRequestMethod("POST");
		Book book =new Book();
		book.setBookName("spring");
		book.setAuther("rod johnson");
		book.setPrice(200);
		ObjectMapper mapper=new ObjectMapper();
		String bookJson=mapper.writeValueAsString(book);
		System.out.println(bookJson);
		httpcon.setDoOutput(true);
		
		OutputStream os=httpcon.getOutputStream();
		os.write(bookJson.getBytes());
		os.flush();  
        
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

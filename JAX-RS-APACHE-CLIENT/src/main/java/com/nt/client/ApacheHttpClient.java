package com.nt.client;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import sun.reflect.ReflectionFactory.GetReflectionFactoryAction;

public class ApacheHttpClient {

	public static void main(String[] args)throws Exception {
		DefaultHttpClient client=new DefaultHttpClient();
		HttpGet httpGet=new HttpGet("http://localhost:4040/JAX-RS-GERSEY-IMPLEMENTATION/rest/book/get");
		
		httpGet.addHeader("accept", "application/json");
		InputStream is=client.execute(httpGet).getEntity().getContent();
 
		InputStreamReader isd=new InputStreamReader(is);
		HttpResponse response = client.execute(httpGet);
	}

}

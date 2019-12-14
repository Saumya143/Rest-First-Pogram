package com.nt.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WelcomeResourceClient {

	public static void main(String[] args) throws Exception {

		String mesurl = "http://localhost:4040/jax-rs-path-param-injection/api/book/isbn";
		// create url object
		URL url = new URL(mesurl);
		// create connection
		url.openConnection();
		// establish the connection
		HttpURLConnection httpcon = (HttpURLConnection) url.openConnection();
		// get the resource type to resource
		httpcon.setRequestMethod("GET");
		// get the status code
		int statusCode = httpcon.getResponseCode();
		System.out.println(statusCode);
				// read the content of code
		if (statusCode==200) {
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

			System.out.println(br.readLine());
			httpcon.disconnect();
		} else {
			System.out.println("restful application failed");
		}

	}

}

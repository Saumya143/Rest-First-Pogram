package com.cal.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "com.cal.service.CalculatorService")
public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public int add(int i, int j) {
		return i + j;
	}

	public int sub(int i, int j) {
		return i - j;
	}
}

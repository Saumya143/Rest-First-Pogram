package com.cal.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface CalculatorService {

	@WebMethod
	public int add(int i, int j);

	@WebMethod
	public int sub(int i, int j);

}

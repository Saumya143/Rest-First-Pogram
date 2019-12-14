package com.cal.test;

import com.cal.service.CalculatorService;
import com.cal.service.CalculatorServiceImplService;

public class CalculatorTest {

	public static void main(String[] args) {
		CalculatorServiceImplService service = new CalculatorServiceImplService();
		CalculatorService stub = service.getCalculatorServiceImplPort();
		int result = stub.add(101, 20);
		System.out.println("Result : " + result);
	}

}

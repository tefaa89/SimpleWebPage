package com;

public class Model {
	public String printPattern(String aStr, String bStr) {
		String result = "";
		int a = Integer.parseInt(aStr);
		int b = Integer.parseInt(bStr);

		for (int i = a; i <= b; i++) {
			result += checkNum(i) + " ";
		}
		return result;
	}

	private String checkNum(int num) {
		if (num % 3 == 0 && num % 5 == 0)
			return "FizzBuzz";
		else if (num % 3 == 0)
			return "Fizz";
		else if (num % 5 == 0)
			return "Buzz";
		return num + "";
	}
}

package com.libertymutual.goforcode.calculator.models;

public class Calculator {
	private Double result;

	public void calculate(Double firstNumber, String operator, Double secondNumber) {

		if (operator != null) {
			if (operator.equals("addition")) {
				result = firstNumber + secondNumber;
			}

			if (operator.equals("subtraction")) {
				result = firstNumber - secondNumber;
			}

			if (operator.equals("multiplication")) {
				result = firstNumber * secondNumber;
			}

			if (operator.equals("division")) {
				result = firstNumber / secondNumber;
			}

			if (operator.equals("exponent")) {
				result = Math.pow(firstNumber, secondNumber);
			}
		}
		
	}

	public String getResult() {
		if (this.result != null) {
//			boolean hasRemainder = this.result % 1 != 0;
//			if (hasRemainder) {
//				return String.valueOf(result.intValue());
//			}
			String resultAsString = String.valueOf(this.result);
			int lastIndex = resultAsString.length() - 1;
			String lastTwoCharacters = resultAsString.substring(lastIndex - 1, lastIndex + 1);
			if (lastTwoCharacters.equals(".0")) {
				return resultAsString.substring(0, lastIndex - 1);
			} else {
				return resultAsString;
			}
		} else {
			return "No input.";
		}
	}
	
	public void clearResult() {
		result = null;
	}

}

package com.org.carpool;

import java.util.concurrent.CopyOnWriteArrayList;

public class PostfixCalculator {

	public float calculate(String input) throws PercentageException{
		String inputArray[] = input.split(" ");
		float result = 0;
		CopyOnWriteArrayList<Float> digits = new CopyOnWriteArrayList<>();
		if (inputArray.length > 0) {
			result = processInput(inputArray, digits);
		}else{
			throw new PercentageException();
		}
		return result;
	}

	private float processInput(String[] inputArray, CopyOnWriteArrayList<Float> digits)
			throws PercentageException {
		float result=0;
		for (String element : inputArray) {
			result = abstarctfactory(digits, element);
		}
		return result;
	}

	private float abstarctfactory(CopyOnWriteArrayList<Float> digits, String element)
			throws PercentageException {
		float result=0;
		element.trim();
		if(element.trim().isEmpty())
			throw new PercentageException();
		if (isOperation(element)) {
			result = operationFactory(digits, element);
		} else {
			digits.add(Float.parseFloat(element));
		}
		return result;
	}

	private float operationFactory(CopyOnWriteArrayList<Float> digits, String element)
			throws PercentageException {
		float result=0;
		if ((digits.size() >= 2) || (digits.size()>=1 && element.equals("%"))) {
			if (element.equals("+") || element.equals("-") || element.equals("*") || element.equals("/") || element.equals("^")){
				result = binaryOperation(element, digits);
			}else if(element.equals("!") || element.equals("%")){
				result = urinaryOperation(element, digits);
			}
		}else{
			throw new PercentageException();
		}
		digits.add(result);
		return result;
	}

	private float binaryOperation(String element, CopyOnWriteArrayList<Float> digits) {
		float result = 0;
		float val1 = digits.get(digits.size()-2);
		float val2 = digits.get(digits.size()-1);
		if (element.equals("-"))
			result = diff(val1,val2);
		else if (element.equals("-")){
			result = diff(val1,val2);
		}
		else if (element.equals("/")){
			result = div(val1,val2);
		}
		else if (element.equals("*")){
			result = mul(val1,val2);
		}
		else if (element.equals("^")){
			result = pow(val1,val2);
		}
		else if (element.equals("+")){
			result = add(val1,val2);
		}
		binaryPopupStratey(digits);
		return result;
	}

	private float urinaryOperation(String element,CopyOnWriteArrayList<Float> digits) throws PercentageException {
		float result = 0;
		float val1 = digits.get(digits.size()-2);
		float val2 = digits.get(digits.size()-1);
		if (element.equals("%"))
			result = percentage(val2);
		else if (element.equals("!"))
			result = factorial(val2);
		urinaryPopupStratey(digits);
		return result;
	}

	private float factorial(float val2) {
		float result=val2;
		return 0;
	}

	private void urinaryPopupStratey(CopyOnWriteArrayList<Float> digits) {
		digits.remove(digits.size()-2);
	}
	
	private void binaryPopupStratey(CopyOnWriteArrayList<Float> digits) {
		digits.remove(digits.size()-2);digits.remove(digits.size()-1);
	}
    
	private float percentage(float val1) throws PercentageException{
		if(val1<0){
			System.out.println("invalid expression for percentage");
			throw new PercentageException();
		}
		return val1/100;
	}

	private float pow(float val1, float val2) {
		float result = val1;
		for(int i=0;i<val2-1;i++){
			result = result * val1;
		}
		return result;
	}

	private boolean isOperation(String element){
		if (element.equals("+") || element.equals("-") || element.equals("*") || element.equals("/") || element.equals("^") || element.equals("%")) 
			return true;
		else 
			return false;
	}
	
	private float diff(float val1, float val2) {
		return val1-val2;
	}

	private float mul(float val1, float val2) {
		return val1*val2;
	}
	private float add(float val1, float val2) {
		return val1+val2;
	}

	private float div(float val1, float val2) {
		return val1/val2;
	}


}

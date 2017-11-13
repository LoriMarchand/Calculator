package com.libertymutual.goforcode.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.libertymutual.goforcode.calculator.models.Calculator;
 
@Controller
public class CalculatorController {
	private Calculator iWantADrink = new Calculator();

	@RequestMapping("/")
	public ModelAndView defaultPage(Double firstNumber, String operator, Double secondNumber) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("calculator");
		iWantADrink.clearResult();
		iWantADrink.calculate(firstNumber, operator, secondNumber);
		mv.addObject("iWantADrink", iWantADrink);
		return mv;
	}

}

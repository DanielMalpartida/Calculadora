package com.prueba.Calculator.controller;



import com.prueba.Calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/calculator")
public class controller {

    @Autowired
    private CalculatorService calculatorService;


    @RequestMapping(value = "/addition/{number1}/{number2}", method = RequestMethod.GET)
    public int  addition(@PathVariable("number1") int number1, @PathVariable("number2") int number2) {

        return  calculatorService.addition(number1,number2);
    }

    @RequestMapping(value = "/subtraction/{number1}/{number2}", method = RequestMethod.GET)
    public int  subtraction(@PathVariable("number1") int number1, @PathVariable("number2") int number2) {

        return  calculatorService.subtraction(number1,number2);
    }

}



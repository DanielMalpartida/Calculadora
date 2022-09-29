package com.prueba.Calculator.service;



import org.springframework.stereotype.Service;


@Service
public class CalculatorService implements ICalcualtorService{



    @Override
    public int addition(int number1,int number2) {
        return number1 + number2;
    }
    @Override
    public int subtraction(int number1,int number2){
        return number1 - number2;
    }


}
package com.prueba.Calculator.service;



import io.corp.calculator.TracerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


@Service
public class CalculatorService implements ICalcualtorService{


    private final TracerImpl tracer;

    public CalculatorService(TracerImpl tracer) {
        this.tracer = tracer;
    }



    @Override
    public int addition(int number1,int number2) throws Exception{
        int total=0;
        //se añade la condicion ya que una suma de un negativo mas un positivo sigue siendo suma -7+3
        if((number1>=0)&&(number2>=0)) {

            tracer.trace(" is " + (number1 + number2));
            total= number1 + number2;
        }
        else {
            tracer.trace(" Error because some number is not positive");

            throw new Exception("Error because some number is not positive");
            //use a exception for rupture program
            //if we need to use
        }
        return total;
    }
    @Override
    public int subtraction(int number1,int number2)throws Exception{
        int total=0;
        if((number1>=0)&&(number2>=0)) {


            tracer.trace(" is " + (number1 - number2));
            total= number1 - number2;
        }
        else{
            tracer.trace(" Error ");
            throw new Exception("Error because some number is not positive");
        }


        System.out.println(tracer.toString());
        return total;
    }


}
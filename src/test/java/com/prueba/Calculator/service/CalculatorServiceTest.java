package com.prueba.Calculator.service;

import io.corp.calculator.TracerImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)//importancion del mockito sirve como im
class CalculatorServiceTest {


    @Mock
    private  TracerImpl tracer;
    @InjectMocks
    private CalculatorService calculatorService;


    @Test
    void expectedAdditionOK()throws Exception {
        int  result=1;
      result= calculatorService.addition(2,7);
      assertEquals(result,9);
    }



    @Test
    void expectedAdditionExcpetion() {
        Assertions.assertThrows(Exception.class,
                ()->calculatorService.addition(-1,-7));
    }


    @Test
    void expectedSubtractionOK()throws Exception {
        int  result=1;
        result= calculatorService.subtraction(2,7);
        assertEquals(result,-5);
    }



    @Test
    void expectedSubtractionExcpetion() {
        Assertions.assertThrows(Exception.class,()->calculatorService.subtraction(-1,-5));

    }

}
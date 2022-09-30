package com.prueba.Calculator.controller;

import com.prueba.Calculator.service.impl.CalculatorService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = CalculatorController.class)
class calculatorControllerTest {


    @Autowired
    private MockMvc mockMvc;




    @MockBean
    private CalculatorService calculatorService;


    @Test
    void AdditionOK() throws Exception {
        int number1=1;
        int number2=2;


        mockMvc.perform(get("/calculator/addition/{number1}/{number2}",number1,number2)
                .contentType("application/json")).andExpect(status().isOk());

    }

    @Test
    void AdditionKO_400() throws Exception {
        int number1=1;
        String number2="z";

        mockMvc.perform(get("/calculator/addition/{number1}/{number2}",number1,number2)
                .contentType("application/json")).andExpect(status().isBadRequest());

    }

    @Test
    void AdditionKO_404() throws Exception {
        int number1=-1;
        int number2=-2;

        mockMvc.perform(get("/calculator/additions/{number1}/{number2}",number1,number2)
                .contentType("application/json")).andExpect(status().isNotFound());
    }

    @Test
    void AdditionKO_405() throws Exception {
        int number1=1;
        int number2=2;

        mockMvc.perform(post("/calculator/addition/{number1}/{number2}",number1,number2)
                .contentType("application/json")).andExpect(status().isMethodNotAllowed());
    }

    @Test
    void AdditionKO_500() throws Exception {
        int number1=1;
        int number2=2;

        mockMvc.perform(get("/calculator/addition/{number1}/{number2}",number1,number2)
                .contentType("application/json")).andExpect(status().isInternalServerError());

    }






    @Test
    void subtractionOK()throws Exception {

        int number1=1;
        int number2=2;


        mockMvc.perform(get("/calculator/subtraction/{number1}/{number2}",number1,number2)
                .contentType("application/json")).andExpect(status().isOk());
    }


    @Test
    void subtractionKO_400() throws Exception {
        int number1=1;
        String number2="z";

        mockMvc.perform(get("/calculator/addition/{number1}/{number2}",number1,number2)
                .contentType("application/json")).andExpect(status().isBadRequest());

    }

    @Test
    void subtractionKO_404() throws Exception {
        int number1=-1;
        int number2=-2;

        mockMvc.perform(get("/calculator/additions/{number1}/{number2}",number1,number2)
                .contentType("application/json")).andExpect(status().isNotFound());
    }

    @Test
    void subtractionKO_405() throws Exception {
        int number1=1;
        int number2=2;

        mockMvc.perform(post("/calculator/addition/{number1}/{number2}",number1,number2)
                .contentType("application/json")).andExpect(status().isMethodNotAllowed());
    }

    @Test
    void subtractionKO_500() throws Exception {
        int number1=1;
        int number2=2;

        mockMvc.perform(get("/calculator/addition/{number1}/{number2}",number1,number2)
                .contentType("application/json")).andExpect(status().isInternalServerError());

    }



}
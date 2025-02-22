package com.example.spring_continer.common;

import org.springframework.stereotype.Component;

@Component
public class ItalianChef implements Chef {

    @Override
    public String getDailyRecipe() {
        return "Preparare pasta bla bla bla.";
    }
}

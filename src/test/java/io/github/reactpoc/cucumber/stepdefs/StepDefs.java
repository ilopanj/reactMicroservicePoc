package io.github.reactpoc.cucumber.stepdefs;

import io.github.reactpoc.ReactPocApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = ReactPocApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}

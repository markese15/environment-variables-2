package co.develhope.environmentvariables2.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    @RequestMapping ("/")
    public class Controller {

        @Autowired
        Environment environment;

        @GetMapping
        public String sayHello(){
            return environment.getProperty("myCustomVarTree.welcomeMsg");
        }
}

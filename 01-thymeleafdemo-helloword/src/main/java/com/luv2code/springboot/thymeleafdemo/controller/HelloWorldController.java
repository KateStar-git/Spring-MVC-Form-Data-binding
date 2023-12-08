package com.luv2code.springboot.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
    //new a controller method to show initial HTML form
    //@RequestMapping("/showForm")//process with all: GET,POST,PUT,Delete,etc4
    @GetMapping("/showForm")
    public String showForm(){
        return "helloworld-form"; // spring will add this to helloworld-form.html
    }

    //new a controller method to process the HTML form
    @RequestMapping("/processForm") //process with all: GET,POST,PUT,Delete,etc
    public String processForm() {
        return "helloworld";


    }
    //need a controller method to read form data nad
    //add data to the model

    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model){
        // read the request parameter formt the HTML form

        String theName = request.getParameter("studentName");

        //convert the data to all caps
        theName = theName.toUpperCase();
        //create the message
        String result = "Yo! " + theName;
        //add message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }

    @PostMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName, Model model){
        //"studentName" from HTML file

        // read the request parameter formt the HTML form

       // String theName = request.getParameter("studentName");

        //convert the data to all caps
        theName = theName.toUpperCase();
        //create the message
        String result = "Hi My Friend from v3! " + theName;
        //add message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }



}

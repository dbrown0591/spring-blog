package com.codeup.springblock;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {
    @GetMapping(path= "/add/{number1}/and/{number2}")
    @ResponseBody
    public String math(@PathVariable int number1, @PathVariable int number2){
        return number1 + " + " + number2 + " = " + (number1 + number2);
    }
    @GetMapping(path="/subtract/{number1}/from/{number2}")
    @ResponseBody
    public String subtract(@PathVariable int number1, @PathVariable int number2){
        return number1 + " - " + number2  + " = " + (number1 - number2);
    }
    @GetMapping(path="/multiply/{number1}/and/{number2}")
    @ResponseBody
    public String multiply(@PathVariable int number1, @PathVariable int number2){
        return number1 + " x " + number2 + " = " + (number1 * number2);
    }
    @GetMapping(path="/divide/{number1}/by/{number2}")
    @ResponseBody
    public String divide(@PathVariable int number1, @PathVariable int number2){
        return number1 + " / " + number2 + " = " + (number1 / number2);
    }

}

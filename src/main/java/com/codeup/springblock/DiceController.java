package com.codeup.springblock;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class DiceController{
    @GetMapping("/roll-dice")
        public String showRollDicePage(){
            return "dice";
        }

        //dice method
     @GetMapping("/roll-dice/{guess}")
    public String playDiceGame(@PathVariable int guess, Model viewModel){
            //random number generator from 1 to 6
         int random = (int )(Math.random() * 6 + 1);

         //dice logic if else statements
         //or use a boolean to determine if you win or not

         boolean win = (random == guess) ? true:false;


         //adding your attributes
         viewModel.addAttribute("guess", guess);
         viewModel.addAttribute("random", random);
         viewModel.addAttribute("win",win);
         return "dice";
     }
}

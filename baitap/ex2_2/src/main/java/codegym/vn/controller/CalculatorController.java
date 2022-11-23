package codegym.vn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping("/a")
    public String home(){
        return "list";
    }

    @PostMapping("/test")
    public String save(Model model, @RequestParam("num1") float num1,@RequestParam("num2") float num2,@RequestParam("toantu") String[] toantu){
        float a=0;
        for (String s: toantu
             ) {
            switch (s){
                case "cong": a=num1+num2;
                break;
                case "tru": a=num1-num2;
                break;
                case "nhan": a=num1*num2;
                break;
                case "chia": a=num1/num2;
                break;
            }

        }

        model.addAttribute("a",a);
        model.addAttribute("n1",num1);
        model.addAttribute("n2",num2);
        return "list";
    }
}

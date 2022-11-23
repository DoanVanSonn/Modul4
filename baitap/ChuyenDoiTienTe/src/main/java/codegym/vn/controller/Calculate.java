package codegym.vn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class Calculate {
    @GetMapping("/a")
    public String home(){
        return "list";
    }

    @PostMapping("/test")
    public String calculate(Model model, float a){
        float result = 23000* a;
//        float result = 23000* Float.parseFloat(ip);
        model.addAttribute("input",a);
        model.addAttribute("result",result);
        return "list";
    }
}

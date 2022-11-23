package codegym.vn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ListController {
    @GetMapping("/a")
    public String home(){
        return "list";
    }

    @PostMapping("/test")
    public String save(Model model, @RequestParam("condiment") String[] condiment){
        String str="";
        for (String s: condiment
             ) {
            str += s;

        }
        model.addAttribute("str",str);
        return "list";
    }
}

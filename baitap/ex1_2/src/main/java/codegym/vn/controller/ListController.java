package codegym.vn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Controller
public class ListController {
    @GetMapping("/a")
    public String home(){
        return "list";
    }

    @PostMapping("/test")
    public String save(Model model, @RequestParam("condiment") String condiment){
        Map<String,String> trans = new HashMap<>();
        trans.put("phát triển","develop");
        trans.put("mở rộng","extend");
        trans.put("nâng cao","Advanced");
        trans.put("giải trí","entertainment");
        Set<String> set= trans.keySet();
        String translate= "";
        for (String s: set
             ) {
            if(s.equalsIgnoreCase(condiment)){
                translate= trans.get(s);
                break;
            }

        }
        model.addAttribute("vie",condiment);
        model.addAttribute("eng",translate);
        return "list";
    }
}

package pl.jacob_the_liar.fun_home_help.sandbox;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.Map;

/**
 * @author: Jakub O.  [https://github.com/JacobTheLiar]
 * @date : 30.08.2019 08:38
 * *
 * @className: StartPageController
 * *
 * *
 ******************************************************/
@Controller
public class SandBoxPageController {

    @Value("${application.invite_message}")
    private String inviteMessage = "hello";

    @GetMapping("/sandbox")
    public String index(Map<String, Object> model){

        model.put("invite_message", inviteMessage);
        model.put("current_date", LocalDateTime.now());

        return "sandbox.html";
    }

}

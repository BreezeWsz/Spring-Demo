package ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ssm.pojo.Manager;
import ssm.service.ManagerService;

@Controller
public class ManegerController {

    @Autowired
    private ManagerService managerService;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login() {
        return "/login";
    }

    @RequestMapping("/verification")
    public String verification(Manager manager) {
        boolean verification = managerService.verification(manager);
        if(verification == true){
            return "redirect:/employee/page/1";
        }
        else{
            return "/login_defeat";
        }
    }
}

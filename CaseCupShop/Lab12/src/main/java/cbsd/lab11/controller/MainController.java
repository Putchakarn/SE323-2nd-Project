package cbsd.lab11.controller;

import cbsd.lab11.entity.User;
import cbsd.lab11.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by nuico_000 on 2/27/14.
 */
@Controller
@RequestMapping("/")
public class MainController {
    @Autowired
    UserService userService;

    @RequestMapping("")
    public String index(ModelMap model){
        return "index";
    }

    @RequestMapping("register")
    public String callRegisterPage(Model model){
        model.addAttribute("user",new User());
        return "customerRegister";
    }

    @RequestMapping("userList")
    public String callUserList(Model model){
        model.addAttribute("users",userService.getAllUser());
        return "userList";
    }

}
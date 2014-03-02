package cbsd.lab11.controller;

import cbsd.lab11.entity.Image;
import cbsd.lab11.entity.User;
import cbsd.lab11.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;

/**
 * Created with IntelliJ IDEA.
 * User: Dto
 * Date: 2/3/13
 * Time: 1:38 AM
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @ModelAttribute("userSession")
    public User getUserSession(){
        return new User();
    }

//    @ModelAttribute("date")
//    public Date getUserDate()
//    {
//        return Calendar.getInstance().getTime();
//    }

    @RequestMapping(method = RequestMethod.GET)
    public String login(Model model){
        model.addAttribute("user",new User());
        return "/user/userRegister";
    }

    @RequestMapping(value = "list",method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("users",userService.getAllUser());
        return "/user/userList";
    }

    @RequestMapping(value = "register",method = RequestMethod.POST)
    public String register(@ModelAttribute User user, BindingResult bindingResult,Model model,final RedirectAttributes redirectAttributes){
        model.addAttribute("userSession",user);
        //redirectAttributes.addFlashAttribute("userSession",user);
        return "index";
    }

    @RequestMapping(value = "addValidUser",method = RequestMethod.POST)
    public String addValidLecturer(@Valid User user, BindingResult bindingResult,Model model
            ,@RequestParam("file")MultipartFile file){
        if (bindingResult.hasErrors()){
            return "index";
        }
        // add image object
        try {
            Image image = new Image();
            image.setFilename(file.getName());
            image.setContentType(file.getContentType());
            image.setContent(file.getBytes());
            user.setImage(image);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // image object add
        String source = user.getPassword();
        String md5 = null;
        try {
            MessageDigest mdEnc = MessageDigest.getInstance("MD5"); // Encryption algorithm
            mdEnc.update(source.getBytes(), 0, source.length());
            md5 = new BigInteger(1, mdEnc.digest()).toString(16); // Encrypted string
        } catch (Exception ex) {
            return null;
        }
        user.setPassword(md5);
        userService.addUser(user);

        return "redirect:/product/list";
    }






}

package com.lvkheen.parking.controller;

import com.lvkheen.parking.entity.User;
import com.lvkheen.parking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public String listUsers(Model model){
        List<User> users = userService.getUsers();
        model.addAttribute("users", users);
        return "list-users";
    }

    @GetMapping("/showFormForAdd")
    String showFormForAdd(Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "user-form";
    }

    @PostMapping("/saveUser")
    String saveUser(@ModelAttribute("user") User user){
        userService.saveUser(user);
        return "redirect:/user/list";
        }

        @GetMapping("/showFormForUpdate")
    String showFormForUpdate(@RequestParam("userId") int id, Model model){
        User user = userService.getUser(id);
        model.addAttribute("user", user);
        return "user-form";
        }

        @GetMapping("/delete")
    String deleteUser(@RequestParam("userId") int id, Model model){
        userService.deleteUser(id);
        return "redirect:/user/list";
        }

        @GetMapping("/search")
    String searchUser(@RequestParam("searchName") String searchName, Model model){
        List<User> users = userService.searchUser(searchName);
        model.addAttribute("users", users);
        return "list-users";
        }



























    }

//package com.example.parking.controller;
//
//import com.example.parking.model.User;
//import com.example.parking.service.UserService;
//import jakarta.servlet.http.HttpSession;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//@Controller
//public class AuthController {
//    @Autowired
//    private UserService usvc;
//
//    @GetMapping("/login")
//    public String loginForm() {
//        return "login";
//    }
//
//    @PostMapping("/login")
//    public String login(@RequestParam String username, @RequestParam String password,
//                        HttpSession session, Model m) {
//        User u = usvc.findByUsername(username);
//        if (u != null && u.getPassword().equals(password)) {
//            session.setAttribute("user", u);
//            return "redirect:/";
//        }
//        m.addAttribute("error", "Invalid credentials");
//        return "login";
//    }
//
//    @GetMapping("/signup")
//    public String signupForm(Model m) {
//        m.addAttribute("user", new User());
//        return "signup";
//    }
//
//    @PostMapping("/signup")
//    public String signup(@ModelAttribute User user, Model m) {
//        if (usvc.findByUsername(user.getUsername()) != null) {
//            m.addAttribute("error", "Username already exists");
//            return "signup";
//        }
//        usvc.save(user);
//        return "redirect:/login";
//    }
//
//    @GetMapping("/logout")
//    public String logout(HttpSession session) {
//        session.invalidate();
//        return "redirect:/login";
//    }
//}
//package com.example.parking.controller;
//
//import com.example.parking.model.User;
//import com.example.parking.service.UserService;
//import jakarta.servlet.http.HttpSession;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//@Controller
//public class AuthController {
//
//    @Autowired
//    private UserService usvc;
//
//    // Show Welcome Page
//    @GetMapping({"/", "/welcome"})
//    public String showWelcome() {
//        return "welcome";
//    }
//
//    // Show Login Page
//    @GetMapping("/login")
//    public String loginForm() {
//        return "login";
//    }
//
//    // Handle Login Submission
//    @PostMapping("/login")
//    public String login(@RequestParam String username, @RequestParam String password, HttpSession session, Model model) {
//        User user = usvc.findByUsername(username);
//        if (user != null && user.getPassword().equals(password)) {
//            session.setAttribute("user", user);
//            return "redirect:/index";
//        }
//        model.addAttribute("error", "Invalid credentials");
//        return "login";
//    }
//
//    // Show Signup Page
//    @GetMapping("/signup")
//    public String signupForm(Model model) {
//        model.addAttribute("user", new User());
//        return "signup";
//    }
//
//    // Handle Signup Submission
//    @PostMapping("/signup")
//    public String signup(@ModelAttribute User user, Model model) {
//        if (usvc.findByUsername(user.getUsername()) != null) {
//            model.addAttribute("error", "Username already exists");
//            return "signup";
//        }
//        usvc.save(user);
//        return "redirect:/login";
//    }
//
//    // Logout
//    @GetMapping("/logout")
//    public String logout(HttpSession session) {
//        session.invalidate();
//        return "redirect:/login";
//    }
//}
package com.example.parking.controller;

import com.example.parking.model.User;
import com.example.parking.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthController {

    @Autowired
    private UserService usvc;

    @GetMapping({"/", "/welcome"})
    public String welcome() {
        return "welcome";
    }

    @GetMapping("/login")
    public String loginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, HttpSession session, Model model) {
        User user = usvc.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            session.setAttribute("user", user);
            return "redirect:/index";
        }
        model.addAttribute("error", "Invalid credentials");
        return "login";
    }

    @GetMapping("/signup")
    public String signupForm(Model model) {
        model.addAttribute("user", new User());
        return "signup";
    }

    @PostMapping("/signup")
    public String signup(@ModelAttribute User user, Model model) {
        if (usvc.findByUsername(user.getUsername()) != null) {
            model.addAttribute("error", "Username already exists");
            return "signup";
        }
        try {
            usvc.save(user);
        } catch (Exception e) {
            model.addAttribute("error", "Error saving user");
            return "signup";
        }
        return "redirect:/login";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }
}

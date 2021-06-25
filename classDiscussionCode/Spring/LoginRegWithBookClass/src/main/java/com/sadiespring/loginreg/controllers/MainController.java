package com.sadiespring.loginreg.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sadiespring.loginreg.models.Book;
import com.sadiespring.loginreg.models.LoginUser;
import com.sadiespring.loginreg.models.User;
import com.sadiespring.loginreg.services.BookService;
import com.sadiespring.loginreg.services.UserService;

@Controller
public class MainController {
	
	@Autowired
    private UserService userServ;
	
	@Autowired
	private BookService bookServ;
    
    @GetMapping("/")
    public String index(
    		Model model,
    		@ModelAttribute("newUser") User newUser,
    		@ModelAttribute("newLogin") LoginUser newLogin
    		) {;
        return "index.jsp";
    }
    
    @GetMapping("/home")
    public String home(
    		HttpSession session,
    		Model model) {
    	if(session.getAttribute("userId") == null) {
    		return "redirect:/";
    	}
    	User user = userServ.getUserById((Long)session.getAttribute("userId"));
    	model.addAttribute("user", user);
    	return "home.jsp";
    }
    
    @PostMapping("/register")
    public String register(
    		@Valid @ModelAttribute("newUser") User newUser, 
            BindingResult result, Model model, HttpSession session) {
        
    	User user = userServ.register(newUser, result);
        
        if(result.hasErrors()) {
            model.addAttribute("newLogin", new LoginUser());
            model.addAttribute("newUser", new User());
            return "index.jsp";
        }
        session.setAttribute("userId", user.getId());
        
        return "redirect:/home";
    }
    
    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
            BindingResult result, Model model, HttpSession session) {
        User user = userServ.login(newLogin, result);
        
        if(result.hasErrors()) {
        	model.addAttribute("newLogin", new LoginUser());
            model.addAttribute("newUser", new User());
            return "index.jsp";
        }
        session.setAttribute("userId", user.getId());
        return "redirect:/home";
    }
    
    @GetMapping("/logout")
    public String logout(HttpSession session){
    	session.invalidate();
    	return "redirect:/";
    }
    
    @GetMapping("/books")
    public String createBookPage(
    		@ModelAttribute("bookObject") Book book,
    		HttpSession session,
    		Model model
    		
    		) {
    	
    	if(session.getAttribute("userId") == null) {
    		return "redirect:/";
    	}
    	
    	Long id = (Long) session.getAttribute("userId");
    	User user = userServ.getUserById(id);
    	model.addAttribute("user", user);
    	
    	return "createPage.jsp";
    }
    
    @PostMapping("/books")
    public String createBook(
    		@Valid @ModelAttribute("bookObject") Book book, 
    		BindingResult result,
    		HttpSession session
    		) {
    	
    	if(session.getAttribute("userId") == null) {
    		return "redirect:/";
    	}
    	
    	if(result.hasErrors()) {
    		return "createPage.jsp";
    	}
    	
    	bookServ.createBook(book);
    	
    	return "redirect:/home";
    }
    
}
